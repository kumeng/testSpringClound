package fistpac.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages={"fistpac"})
public class Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Bootstrap.class, args);
	}

}
