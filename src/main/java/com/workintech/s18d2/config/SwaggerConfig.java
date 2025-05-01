package com.workintech.s18d2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI vegetableOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Vegetable API")
                        .description("API documentation for Vegetable management")
                        .version("1.0.0"));
    }
}
