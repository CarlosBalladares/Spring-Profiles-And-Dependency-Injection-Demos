package com.example.SpringApp2;

import com.example.SpringApp2.controllers.ConstructorInjectedController;
import com.example.SpringApp2.controllers.MyController;
import com.example.SpringApp2.controllers.PropertyInjectedController;
import com.example.SpringApp2.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApp2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringApp2Application.class, args);
		MyController mc = (MyController) ctx.getBean("myController");
		mc.hello();

		System.out.println(mc.hello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
	}
}
