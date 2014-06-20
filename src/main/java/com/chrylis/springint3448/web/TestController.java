package com.chrylis.springint3448.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrylis.springint3448.service.GenericInterface;

@RestController
public class TestController {

	private final GenericInterface genericInterface;

	@Autowired
	public TestController(final GenericInterface genericInterface) {
		this.genericInterface = genericInterface;
	}

	@RequestMapping(value = "/do/{argument}", produces = "text/plain")
	public String doSomething(@PathVariable String argument) {
		genericInterface.doSomething(argument);
		return "did " + argument;
	}
}
