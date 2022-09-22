package com.argprog.portfolioweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfoliowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfoliowebApplication.class, args);
	}
        
        @Bean//con esto configuramos el cors para permitir o restringir acceso a los dominios
        public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://portfolioweb-frontend.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
        /*@Bean//con esto configuramos el cors para permitir o restringir acceso a los dominios
        public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
                    @Override
			public void addCorsMappings(CorsRegistry registry) {
                            registry.addMapping("/**")
                                    .allowedOrigins("http://localhost:4200")
                                    .allowedMethods("GET","POST","PUT","DELETE")
                                    .maxAge(3600);
                            
                        }
                };
        }*/

}
