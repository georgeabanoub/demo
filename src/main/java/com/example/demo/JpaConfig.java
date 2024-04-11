package com.example.demo;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JpaConfig {
@Autowired
private DataSource dataSource;

@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	em.setDataSource(dataSource);
	em.setPackagesToScan("com.example.demo.entity");
	return em;
}
@Bean
public PlatformTransactionManager transactionManager(jakarta.persistence.EntityManagerFactory emf){
JpaTransactionManager txManager  = new JpaTransactionManager();
txManager.setEntityManagerFactory(emf);;
return txManager;
}

}
