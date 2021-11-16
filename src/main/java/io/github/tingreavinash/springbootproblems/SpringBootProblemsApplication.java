package io.github.tingreavinash.springbootproblems;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import io.github.tingreavinash.springbootproblems.entity.Manager;
import io.github.tingreavinash.springbootproblems.service.EmployeeService;
import io.github.tingreavinash.springbootproblems.service.ManagerService;
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
	@Autowired
	public ManagerService managerService;

	@Override
	public void run(String... args) throws Exception {
		//employeeService.display();
		Manager manager = managerService.getManager();
		System.out.println(manager.getManagerName());
	}
}
