package com.amar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
/*
 *  @EnableWebMvc detects the existence of Jackson and JAXB 2 on the classpath(it founds the jar) 
 *  and automatically creates and registers default JSON and XML converters.
 */
@Configuration
@ComponentScan(basePackages = {"com.amar.controller","com.amar.service"})
public class WebAppConfig {

}
