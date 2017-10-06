package com.bk.safetyBK.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.bk.safetyBK")
@Configuration
//@Import(WebConfig.class)
public class DemoApplication implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

		configurableEmbeddedServletContainer.setPort(8003);
	}
}
