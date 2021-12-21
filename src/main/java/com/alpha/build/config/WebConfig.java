package com.alpha.build.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Web MVC configuration class.
 * 
 * The @Configuration annotation defines the class as a source of bean definitions for Spring Boot.
 * The @ComponentScan annotatoin defines component scan of the REST controllers in the org.alpha.pipeline.controller package.
 */
@Configuration
@ComponentScan("org.alpha.build.controller")
public class WebConfig {    
}
