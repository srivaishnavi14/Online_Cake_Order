package com.onlinecakeshopping;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//this annotation is to denote this is spring boot application
@SpringBootApplication
@EnableSwagger2
//It tells spring to scan for annotated components
@ComponentScan(basePackages = "com.onlinecakeshopping")
public class OnlineCakeShoppingApplication {



 public static void main(String[] args) {
      SpringApplication.run(OnlineCakeShoppingApplication.class, args);
      System.out.println("Online_Cake_Shopping is Application is Ready ");
  }
 @Bean
	public Docket swaggerConfiguration() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.any())
					.apis(RequestHandlerSelectors.basePackage("com.onlinecakeshopping"))
					.build();
	}
}