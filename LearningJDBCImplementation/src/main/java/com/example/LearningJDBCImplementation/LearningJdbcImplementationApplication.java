package com.example.LearningJDBCImplementation;

import com.example.LearningJDBCImplementation.util.DBInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningJdbcImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJdbcImplementationApplication.class, args);
		DBInit.init();
	}

}
