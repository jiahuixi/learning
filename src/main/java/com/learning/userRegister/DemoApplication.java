package com.learning.userRegister;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement//事务注解
@MapperScan("com.learning.userRegister.dao")
public class DemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//public static void main(String[] args) {
	//	SpringApplication.run(DemoApplication.class, args);
	//}
}
