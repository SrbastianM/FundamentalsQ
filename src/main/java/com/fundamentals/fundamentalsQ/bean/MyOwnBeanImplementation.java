package com.fundamentals.fundamentalsQ.bean;

public class MyOwnBeanImplementation implements MyOwnBean{
    private String name; //atributos

    public MyOwnBeanImplementation(String name) { //Este constructor, asigna la variable interna name a name, para que luego se pueda reescribir
        this.name = name;
    }

    public MyOwnBeanImplementation() {
        name = "Carlos"; //Se reescribe la variable, asignandole un valor de tipo String tal y como se menciona en los
    }


    @Override
    public void printable() {
        System.out.println("Hello from My own bean " + name);
    }
}
