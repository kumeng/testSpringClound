package fistpac.config;

/**
 * http://localhost:8080/swagger-ui.html
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket buildDocket(){
	return new Docket(DocumentationType.SWAGGER_2)
	.apiInfo(buildApiInf())
	.select()
	.apis(RequestHandlerSelectors.basePackage("fistpac.controller"))
	.paths(PathSelectors.any())
	.build();
	}

	private ApiInfo buildApiInf(){
	return new ApiInfoBuilder()
	.title("title:xingguo大标题")
	.description("description:springboot swagger2")
	.termsOfServiceUrl("http://blog.csdn.net/u014231523网址链接")
	.contact(new Contact("diaoxingguo", "http://blog.csdn.net/u014231523", "diaoxingguo@163.com"))
	.build();

	} 
}
