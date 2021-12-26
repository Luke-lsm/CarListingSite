package org.meir.controller.api;

import org.meir.jdbc.template.ListingJDBCTemplate;
import org.meir.model.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/listing")
public class ListingController implements ApiController<Listing>{

    @Autowired
    private ListingJDBCTemplate listingRepository;
//
//    @GetMapping("/listing")
//    public List<Listing> getListings(){
//        return listingRepository.select();
//    }

    @Override
    public List<Listing> handleGetAll() {
        return listingRepository.selectAll();
    }

    @Override
    public Listing handleGetById(long id) {
        return listingRepository.selectById(id);
    }

    @Override
    public Listing handlePostObject(Listing object) {
        return null;
    }
}
