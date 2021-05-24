package com.sachet.sfgdi;

import com.sachet.sfgdi.controller.ConstructorInjectedController;
import com.sachet.sfgdi.controller.MyController;
import com.sachet.sfgdi.controller.PropertyInjectedController;
import com.sachet.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) applicationContext.getBean("myController");

		String greetings = controller.sayHello();

		System.out.println(greetings);
		/**
		 * Here SPRING is creating the instance of the controller in Spring Context
		 * This is how inversion of control works, spring is managing the construction of myController.
		 * This is the fundamental tenants of Dependency Injection is to have framework doing all the management
		 * of creating objects and all.
		 */
		System.out.println("---------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayGreeting());

		System.out.println("----------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
