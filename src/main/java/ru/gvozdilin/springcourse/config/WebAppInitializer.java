package ru.gvozdilin.springcourse.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig.class, WebConfig.class);
        context.setServletContext(servletContext);


        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
         dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/hello");
        dispatcher.addMapping("/users");
        dispatcher.addMapping("/remittance");
        dispatcher.addMapping("/add_user");
        dispatcher.addMapping("/delete_user");
        dispatcher.addMapping("/gotoremittance");
        dispatcher.addMapping("/gotohello");
      }


    }

