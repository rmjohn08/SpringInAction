package net.rmj.spring.sia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "net.rmj.spring.sia", "net.rmj.spring.sia.web", "net.rmj.spring.sia.data" })
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
 * @SpringBootApplication
 * 
 * @ComponentScan(basePackages = { "net.rmj.spring.sia" }) public class
 * Application {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(Application.class, args); }
 * 
 * }
 */