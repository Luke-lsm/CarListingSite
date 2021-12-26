package org.meir.jdbc.mapper;

import org.meir.model.CarListing;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarListingMapper implements RowMapper<CarListing> {

    @Override
    public CarListing mapRow(ResultSet rs, int rowNum) throws SQLException {

        CarListing carListing = new CarListing();

        carListing.setTitle(rs.getString("title"));
        carListing.setDescription(rs.getString("description"));
        carListing.setPrice(rs.getInt("price"));

        return carListing;
    }
}
