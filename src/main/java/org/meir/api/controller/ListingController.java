package org.meir.api.controller;

import org.meir.jdbc.template.ListingJDBCTemplate;
import org.meir.model.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ListingController {

    @Autowired
    private ListingJDBCTemplate listingRepository;

    @GetMapping("/listing")
    public List<Listing> getListings(){
        return listingRepository.select();
    }
}
