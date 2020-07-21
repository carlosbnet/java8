package br.com.start.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Classe para substituir o uso do web.xml faz a mesma coisa


public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Tem que indicar qual classe é a minha root
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[] {} ;
    }


    //Configurar o meu mapping
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
