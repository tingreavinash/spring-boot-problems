package io.github.tingreavinash.springbootproblems;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProblemsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProblemsApplication.class, args);

		Employee e1 = (Employee) ctx.getBean("AvinashBean");
		System.out.println(e1.getName());
	}

}
