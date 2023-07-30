package com.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.DispatcherServlet;

// web.xml
public class WordCountWebConfig implements WebApplicationInitializer {
 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		XmlWebApplicationContext webAC = new XmlWebApplicationContext();
		
		   webAC.setConfigLocation("classpath:appconfig.xml");
		// create DispatcherServlet
		
		DispatcherServlet ds  = new DispatcherServlet(webAC);
		
		//RegisterDispatcherServlet
		
	ServletRegistration.Dynamic servlet = servletContext.addServlet("MyDs", ds);
		
	servlet.setLoadOnStartup(1);
	servlet.addMapping("/wordcount.com/*");
	
	}

}
