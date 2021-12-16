package com.fundamentals.fundamentalsQ.configuration;

import com.fundamentals.fundamentalsQ.bean.MyBeanWhitProperties;
import com.fundamentals.fundamentalsQ.bean.MyBeanWhitPropertiesImplement;
import com.fundamentals.fundamentalsQ.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
@EnableConfigurationProperties(UserPojo.class)

public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWhitProperties function(){
        return new MyBeanWhitPropertiesImplement(name, apellido);//esta instanciandose el bean anteriormente creado
    }

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
