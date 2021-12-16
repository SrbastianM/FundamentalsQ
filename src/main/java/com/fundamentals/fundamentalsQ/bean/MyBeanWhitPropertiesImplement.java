package com.fundamentals.fundamentalsQ.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWhitPropertiesImplement implements MyBeanWhitProperties {

    Log LOGGER = LogFactory.getLog(MyBeanWhitPropertiesImplement.class);

    private String name;
    private String apellido;

    public MyBeanWhitPropertiesImplement(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        LOGGER.info("Hemos ingresado al metodo MyBeanWhitPropertiesImplemet");
        return name + "-" + apellido;
    }
}
