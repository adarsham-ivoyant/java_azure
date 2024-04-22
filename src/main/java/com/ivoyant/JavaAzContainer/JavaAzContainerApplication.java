package com.ivoyant.JavaAzContainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAzContainerApplication {

	@GetMapping("/api")
	public String myfunc(){
		return "MyFirstJavaWithContainer";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaAzContainerApplication.class, args);
	}

}
