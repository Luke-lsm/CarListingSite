package org.meir.controller;

import org.meir.jdbc.template.CarListingJDBCTemplate;
import org.meir.model.CarListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ListingController {

    @Autowired
    private CarListingJDBCTemplate carListingRepository;

    @GetMapping("/listings")
    public List<CarListing> getListings(){
        return carListingRepository.select();
    }
}
