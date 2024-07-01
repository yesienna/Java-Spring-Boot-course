package com.learning.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {

        var ctx = SpringApplication.run(JavaApplication.class, args);

        MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
	}
   // @Bean
    public MyFirstClass myFirstClass() {
        return new MyFirstClass();
    }

}
