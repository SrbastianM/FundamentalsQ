package com.fundamentals.fundamentalsQ;

import com.fundamentals.fundamentalsQ.bean.MyBean;
import com.fundamentals.fundamentalsQ.bean.MyBeanWhitDependencyImplement;
import com.fundamentals.fundamentalsQ.bean.MyBeanWhitProperties;
import com.fundamentals.fundamentalsQ.bean.MyOwnBean;
import com.fundamentals.fundamentalsQ.component.ComponentDependency;
import com.fundamentals.fundamentalsQ.entity.User;
import com.fundamentals.fundamentalsQ.pojo.UserPojo;
import com.fundamentals.fundamentalsQ.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentalsQApplication implements CommandLineRunner {
	//aqui se llaman a los atributos de las clases, es algo asi como crear un nuevo objeto.
	private final Log LOGGER = LogFactory.getLog(FundamentalsQApplication.class); //LOGGER ES EL OBJETO


	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWhitDependencyImplement myBeanWhitDependencyImplement;
	private MyOwnBean myOwnBean;
	private MyBeanWhitProperties myBeanWhitProperties;
	private UserPojo userPojo;
	private UserRepository userRepository;

	public FundamentalsQApplication(@Qualifier("componentTwoImplement")ComponentDependency componentDependency, MyBean myBean, MyBeanWhitDependencyImplement myBeanWhitDependencyImplement, MyOwnBean myOwnBean, MyBeanWhitProperties myBeanWhitProperties, UserPojo userPojo, UserRepository userRepository){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWhitDependencyImplement = myBeanWhitDependencyImplement;
		this.myOwnBean = myOwnBean;
		this.myBeanWhitProperties = myBeanWhitProperties; //llamamos a la propiedad y la vamos a igual al parametro llamado como constructor
		this.userPojo = userPojo;
		this.userRepository = userRepository; //Propiedad == al parametro
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsQApplication.class, args);
	}

	private void getInformationJqlFromUser(){
		LOGGER.info("El usuario findByUser" + userRepository.findByUser("juan@mail.com")
				.orElseThrow(()-> new RuntimeException("El Usuario No se encontro")));
	}
	private void saveUserInDataBase (){
		User user1 = new User("Camilo", "Camilo@mail.com", LocalDate.of(2022, 1,14));
		User user2 = new User("Juan", "juan@mail.com", LocalDate.of(2022, 2,15));
		User user3 = new User("Sofia", "sofia@mail.com", LocalDate.of(2022, 3,16));

		List<User> list = Arrays.asList(user1, user2, user3);
		list.stream().forEach(userRepository::save);
	}


	@Override
	public void run(String... args){
		//componentDependency.sayHello(); //Primero llama a la dependencia y luego el metodo de implantacion
		//myBean.print();
		//myBeanWhitDependencyImplement.printMyBeanWhitDependency();
		//myOwnBean.printable();
		//System.out.println(myBeanWhitProperties.function());
		//System.out.println(userPojo.getEmail() + "-" + userPojo.getAge());
		//LOGGER.error("This bullshit doesn't function :( ");
		getInformationJqlFromUser();
		saveUserInDataBase();
	}
}
