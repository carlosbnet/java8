package br.com.startsl.apppet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;



@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "br.com.startsl.apppet")
public class WebappConfig implements WebMvcConfigurer {

   /* @Bean
    public InternalResourceViewResolver viewResolver(){
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();

            resolver.setPrefix("/WEB-INF/");
            resolver.setSuffix(".jsp");

            return resolver;
    }*/


    @Bean
    public UrlBasedViewResolver viewResolver(){

        UrlBasedViewResolver resolver = new UrlBasedViewResolver();

        resolver.setViewClass(TilesView.class);

        return resolver;

    }


    @Bean
    public TilesConfigurer  tilesConfigurer(){

        TilesConfigurer tiles = new TilesConfigurer();

        tiles.setDefinitions(new String[]{"/WEB-INF/tiles.xml"});

        return tiles;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

            registry
                    .addResourceHandler("/resources/**")
                    .addResourceLocations("WEB-INF/resources/");

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {


    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

    }
}
