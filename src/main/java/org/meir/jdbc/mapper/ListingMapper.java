package org.meir.jdbc.mapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.meir.model.Listing;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ListingMapper implements RowMapper<Listing> {

    @SneakyThrows
    @Override
    public Listing mapRow(ResultSet rs, int rowNum) throws SQLException {

        Listing listing = new Listing();

        listing.setTitle(rs.getString("name"));
        listing.setDescription(rs.getString("description"));
        listing.setPrice(rs.getInt("price"));

        String content = rs.getString("content");

        listing.setContent(new ObjectMapper().readValue(content, new TypeReference<HashMap<String,Object>>() {}));

        return listing;
    }
}
