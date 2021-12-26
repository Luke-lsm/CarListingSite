package org.meir;

import org.meir.jdbc.template.CarListingJDBCTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarListingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarListingApplication.class, args);
    }


    @Bean
    public CarListingJDBCTemplate carListingRepository(){
        return new CarListingJDBCTemplate();
    }
}
