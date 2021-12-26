package org.meir.jdbc.template;

import org.meir.dao.ListingDAO;
import org.meir.jdbc.mapper.ListingMapper;
import org.meir.model.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.util.List;

public class ListingJDBCTemplate implements ListingDAO {

    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Listing> selectAll(){
        String SQL = select;
        List<Listing>  listings = jdbcTemplate.query(SQL, new ListingMapper());
        return listings;
    }

    public Listing selectById(long id){
        String SQL = select + "WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", 1);

        return jdbcTemplate.queryForObject(SQL, params, new ListingMapper());

    }
}
