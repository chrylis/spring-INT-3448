package com.chrylis.springint3448;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Comment out the {@code @EnableAsync} annotation, and it works fine.
 *
 * @author Christopher Smith
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("/META-INF/spring/integration/integration-plan.xml")
@EnableAsync
public class Launcher {
	public static void main(String[] args) {
		SpringApplication.run(Launcher.class, args);
	}
}
