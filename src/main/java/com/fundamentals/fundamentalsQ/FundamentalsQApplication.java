package com.fundamentals.fundamentalsQ;

import com.fundamentals.fundamentalsQ.bean.MyBean;
import com.fundamentals.fundamentalsQ.bean.MyBeanWhitDependencyImplement;
import com.fundamentals.fundamentalsQ.bean.MyOwnBean;
import com.fundamentals.fundamentalsQ.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalsQApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWhitDependencyImplement myBeanWhitDependencyImplement;
	private MyOwnBean myOwnBean;

	public FundamentalsQApplication(@Qualifier("componentTwoImplement")ComponentDependency componentDependency, MyBean myBean, MyBeanWhitDependencyImplement myBeanWhitDependencyImplement, MyOwnBean myOwnBean){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWhitDependencyImplement = myBeanWhitDependencyImplement;
		this.myOwnBean = myOwnBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsQApplication.class, args);
	}

	@Override
	public void run(String... args){
		componentDependency.sayHello(); //Primero llama a la dependencia y luego el metodo de implantacion
		myBean.print();
		myBeanWhitDependencyImplement.printMyBeanWhitDependency();
		myOwnBean.isUnderAtack();
	}
}
