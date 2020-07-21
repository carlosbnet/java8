package br.com.startsl.apppet.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"br.com.startsl.apppet.repositorios"})
public class SpringJpaConfig {

    //Configura uma conexão com o banco de dados
    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); //Drive a ser usado
        ds.setUrl("jdbc:mysql://localhost:3306/petshop?createDatabaseIfNotExist=true"); //conexao com o banco
        ds.setUsername("carlos");
        ds.setPassword("carlos415263");

        return ds;
    }

    //Efetua a conexão com o banco de dados, tambem criando varias conexoes com o mesmo, e faz modificações no banco desde criar tabelas ate alterar as mesmas
    @Bean
    public EntityManagerFactory entityManagerFactory(){

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

        factory.setDataSource(dataSource());
        factory.setPackagesToScan("br.com.startsl.apppet.dominios");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setJpaProperties(jpaProperties());
        factory.afterPropertiesSet();

        return factory.getObject();

    }

    @Bean
    public JpaTransactionManager transactionManager(){
        JpaTransactionManager tx = new JpaTransactionManager();

        tx.setEntityManagerFactory(entityManagerFactory());
        tx.setJpaDialect(new HibernateJpaDialect());

        return tx;

    }

    private Properties jpaProperties() {

        Properties props = new Properties();

        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.format_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");

        return props;


    }


}

