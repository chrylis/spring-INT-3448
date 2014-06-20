package com.chrylis.springint3448.service;

import org.springframework.scheduling.annotation.Async;

/**
 * Interface with an {@code @Async} method.
 *
 * @author Christopher Smith
 */
public interface GenericInterface {
	@Async
	void doSomething(String argument);
}
