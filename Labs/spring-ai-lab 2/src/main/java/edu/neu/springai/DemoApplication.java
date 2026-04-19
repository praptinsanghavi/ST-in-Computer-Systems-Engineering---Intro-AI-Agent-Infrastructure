// Declares this class as part of the root package of the Spring AI application.
// IMPORTANT: Placing the main application class at the root package (edu.neu.springai)
// is a Spring Boot convention. @SpringBootApplication triggers component scanning starting
// from this package and recursively scanning all sub-packages (e.g., edu.neu.springai.tools).
// If this class were placed in a sub-package, beans in sibling packages would not be discovered.
package edu.neu.springai;

// Imports SpringApplication, the central class used to bootstrap a Spring Boot application.
// SpringApplication.run() performs the full startup sequence: creating the ApplicationContext,
// registering beans, starting the embedded web server (e.g., Tomcat), and running the application.
import org.springframework.boot.SpringApplication;

// Imports @SpringBootApplication, a convenience meta-annotation that combines three core annotations:
//   1. @Configuration      — marks this class as a source of Spring bean definitions.
//   2. @EnableAutoConfiguration — tells Spring Boot to automatically configure beans based on
//                                 the JARs present on the classpath (e.g., auto-configures
//                                 a ChatClient bean when the Spring AI starter is detected).
//   3. @ComponentScan      — enables recursive classpath scanning from this package downward,
//                            discovering all @Component, @Service, @RestController, and @Tool beans.
// Together, these three annotations form the foundation of a Spring Boot application.
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Applies the @SpringBootApplication meta-annotation to this class.
// This single annotation activates auto-configuration, component scanning, and bean registration
// for the entire application, eliminating the need for verbose XML or Java-based configuration files.
// Spring Boot will auto-configure the LLM ChatClient, embedded Tomcat server, and all other
// infrastructure beans based on what is found in application.properties and the classpath.
@SpringBootApplication
public class DemoApplication {

	// The standard Java application entry point — the JVM looks for a public static
	// void main(String[])
	// method as the starting point of execution when the JAR or class is launched.
	// Spring Boot applications are started by calling SpringApplication.run() from
	// within this method.
	// Parameters:
	// args - command-line arguments passed to the application at startup (e.g.,
	// from the CLI
	// or CI/CD pipeline). Spring Boot can use these to override application
	// properties
	// (e.g., --server.port=9090 on the command line overrides the value in
	// application.properties).
	public static void main(String[] args) {

		// Bootstraps the entire Spring Boot application from this class.
		// SpringApplication.run() performs the following sequence of operations:
		// 1. Creates a Spring ApplicationContext (the IoC container that manages all
		// beans).
		// 2. Triggers @ComponentScan to discover and register all @Component, @Service,
		// @RestController, and other annotated beans under edu.neu.springai and
		// sub-packages.
		// 3. Runs @EnableAutoConfiguration to auto-configure infrastructure beans:
		// - An OpenAI-backed ChatClient (because spring-ai-openai-spring-boot-starter
		// is on the classpath)
		// - An embedded Tomcat HTTP server (because spring-boot-starter-web is present)
		// - And any other auto-configurations triggered by classpath dependencies.
		// 4. Starts the embedded Tomcat server on the configured port (default: 8080),
		// registering all @RestController endpoints (e.g., GET /ask from
		// AskController).
		// 5. Logs startup information and signals that the application is ready to
		// handle requests.
		// DemoApplication.class — passed as the primary source so Spring knows which
		// package
		// to use as the root for component scanning and auto-configuration.
		// args — forwarded to Spring so command-line arguments can override
		// application.properties values.
		SpringApplication.run(DemoApplication.class, args);
	}

}
