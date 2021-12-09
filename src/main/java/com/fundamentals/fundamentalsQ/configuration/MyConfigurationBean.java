package com.fundamentals.fundamentalsQ.configuration;


import com.fundamentals.fundamentalsQ.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation myOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWhitDependencyImplement myBeanOperationWhitDependencyImplement(MyOperation myOperation) {
        return new MyBeanWhitDependencyImplement(myOperation);
    }
    @Bean
    public MyOwnBean myOwnBean() {
        return new MyOwnBeanImplementation();
    }
}
