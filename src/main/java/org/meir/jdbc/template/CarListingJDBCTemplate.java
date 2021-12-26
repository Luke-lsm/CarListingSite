package org.meir.jdbc.template;

import org.meir.dao.CarListingDAO;
import org.meir.jdbc.mapper.CarListingMapper;
import org.meir.model.CarListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CarListingJDBCTemplate implements CarListingDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<CarListing> select(){
        String SQL = "select * from car_listing_dao";
        List<CarListing>  listings = jdbcTemplate.query(SQL, new CarListingMapper());
        return listings;
    }
}
