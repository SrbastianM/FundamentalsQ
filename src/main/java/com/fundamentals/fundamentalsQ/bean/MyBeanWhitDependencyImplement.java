package com.fundamentals.fundamentalsQ.bean;

public class MyBeanWhitDependencyImplement implements MyBeanWhitDependency{

    private MyOperation myOperation;    //inyectamos ya a la dependencia

    public MyBeanWhitDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printMyBeanWhitDependency() {
        int number  = 1;
        System.out.println(myOperation.sum(number + 10));
        System.out.println("Hey! ugly guys :D //Desde la implementacion de un bean Con dependencia "); //implementacion desde otra dependencia
    }
}
