spring-INT-3448
===============

Example test case showing the bug I described in INT-3448. Enabling Spring
async support when a service interface has an `@Async` method produces a
`NullPointerException` on invocation.

To run this test case, run as a Spring Boot app from STS or use the Maven goal
`exec:java`. Issue a `GET` request to `/do/{argument}`. The test case works
properly if the `@EnableAsync` annotation is commented out of the configuration
in `Launcher`.