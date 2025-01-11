package com.springboot.app;


import com.springboot.app.config.JdbcConfig;
import com.springboot.app.domain.Employee;
import com.springboot.app.service.EmployeeService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDataAccessApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
////
//		employeeService.getEmployeeById(6);
//
//		employeeService.getEmployeeCount();
//
//		employeeService.getEmployeeByIdList(Arrays.asList(6,7));

		employeeService.getEmployeeByIdHibernate(6);

		Employee employee1 = new Employee();
		employee1.setFirstname("Jdbc");
		employee1.setLastname("Jdbc");
		employee1.setEmail("Jdbc@Jdbc.com");

		Employee employee2 = new Employee();
		employee2.setFirstname("Jdba");
		employee2.setLastname("Jdba");
		employee2.setEmail("Jdbc@Jdbc.com");

		employeeService.addEmployee(employee1,employee2);


	}

}
