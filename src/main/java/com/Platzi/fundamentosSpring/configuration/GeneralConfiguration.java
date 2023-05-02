package com.Platzi.fundamentosSpring.configuration;


import com.Platzi.fundamentosSpring.bean.MyBean;
import com.Platzi.fundamentosSpring.bean.implementation.MyBeanTwoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:connection.properties")

public class GeneralConfiguration {

    @Value("${value.name}")
    private String name;

    @Value("${value.random}")
    private String randomValue;

    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${driver}")
    private String driver;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;





    @Bean
    public MyBean myBean() {
        return new MyBeanTwoImpl(name, randomValue);
    }
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driver);
        dataSourceBuilder.url(jdbcUrl);
        dataSourceBuilder.username(userName);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }


}
