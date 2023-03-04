package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.masai")
public class Config {
	
    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Bike bike() {
        return new Bike();
    }

}
