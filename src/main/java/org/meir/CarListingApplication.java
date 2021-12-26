package org.meir;

import org.meir.jdbc.template.ListingJDBCTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarListingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarListingApplication.class, args);
    }

    @Bean
    public ListingJDBCTemplate listingRepository(){
        return new ListingJDBCTemplate();
    }
}
