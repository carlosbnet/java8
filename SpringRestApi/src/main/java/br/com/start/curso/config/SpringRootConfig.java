package br.com.start.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Configurações iniciais, bem como onde o java vai procurar nossas class
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("br.com.start.curso")
public class SpringRootConfig {
}
