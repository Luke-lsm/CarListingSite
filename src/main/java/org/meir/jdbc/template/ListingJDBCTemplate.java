package org.meir.jdbc.template;

import org.meir.dao.ListingDAO;
import org.meir.jdbc.mapper.ListingMapper;
import org.meir.model.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ListingJDBCTemplate implements ListingDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Listing> select(){
        String SQL = "select * from car_listing_dao";
        List<Listing>  listings = jdbcTemplate.query(SQL, new ListingMapper());
        return listings;
    }
}
