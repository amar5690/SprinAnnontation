package com.amar.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitialeser  implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext rootContext=new AnnotationConfigWebApplicationContext();
	//	rootContext.scan("com.amar");
		
		rootContext.register(WebAppConfig.class);
		
		rootContext.setServletContext(servletContext);
		servletContext.addListener(new ContextLoaderListener(rootContext));
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispather", new DispatcherServlet(rootContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		
		
	}

}
