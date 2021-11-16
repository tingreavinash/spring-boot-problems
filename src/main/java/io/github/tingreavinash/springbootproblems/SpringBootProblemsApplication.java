package io.github.tingreavinash.springbootproblems;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import io.github.tingreavinash.springbootproblems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProblemsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProblemsApplication.class, args);

		//Employee e1 = ctx.getBean(Employee.class);
		/**
		 * It will print NoUniqueBeanDefinitionException if multiple beans are present with same type.
		 * This can be solved by using @Primary annotation during bean creation.
		 */
		//System.out.println(e1.getName());

	}

	@Autowired
	public EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		employeeService.display();
	}
}
