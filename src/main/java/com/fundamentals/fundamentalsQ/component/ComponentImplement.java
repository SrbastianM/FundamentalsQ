package com.fundamentals.fundamentalsQ.component;


import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{

    @Override
    public void sayHello() {
        System.out.println("Hi Beutty people!");
    }
}
