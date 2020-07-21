package br.com.startsl.apppet.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;




public class SpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { return new Class[]{WebSecurityConfig.class,WebappConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
