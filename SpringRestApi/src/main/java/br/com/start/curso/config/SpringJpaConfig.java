package br.com.start.curso.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;



import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;
//Configura minhas benas de de acesso ao banco ate propriedades da JPA
@Configuration

public class SpringJpaConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test?createDatabaseIfNotExist=true");
        ds.setUsername("carlos");
        ds.setPassword("carlos415263");
        return ds;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("br.com.start.curso.domain");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setJpaProperties(jpaProperties());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    @Bean
    public JpaTransactionManager transactionManager() {
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
