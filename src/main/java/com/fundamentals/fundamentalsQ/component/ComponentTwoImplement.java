package com.fundamentals.fundamentalsQ.component;


import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void sayHello() {
        System.out.println("Hi a little ugly people");
    }
}
