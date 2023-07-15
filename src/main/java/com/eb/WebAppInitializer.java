package com.eb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

    //db and hibernate relations settings
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]
                {
                        RootContextConfig.class
                };
    }

    //Spring MVC config class
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]
                {
                        WebMvcConfig.class
                };
    }

    //which url will be for the servlet
    @Override
    protected String[] getServletMappings() {
        return new String[]
                {
                        "/"
                };
    }
}
