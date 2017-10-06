package com.bk.safetyBK.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 21:38 2017/10/3
 */
//@Configuration
//@EnableSwagger2
public class swaggerConfig  extends WebMvcConfigurerAdapter {

//    @Bean
    public Docket createRestApi() {
        System.out.println("run createRestApi");
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.bk.safetyBK"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("safetyBK 接口说明")
                .description("safetyBK平台接口说明文档").contact(new Contact("MarissaMan", "www.bk.com", "safetyBK@bk.com"))
                .version("1.0").build();
    }
}
