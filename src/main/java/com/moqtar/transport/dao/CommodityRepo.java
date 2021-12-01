package com.moqtar.transport.dao;
import java.lang.String;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.moqtar.transport.dao.entity.Commodity;

@Repository
public class CommodityRepo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
   
	class CommodityRowMapper implements RowMapper<Commodity> {
		@Override
		public Commodity mapRow(ResultSet rs, int rowNum) throws SQLException {
			Commodity commodity = new Commodity();
			
			commodity.setCommodityDetailes(rs.getString("Commodity_Detailes"));
			commodity.setCarName(rs.getString("Car_Name"));
			commodity.setRegistrationNumber(rs.getString("Registration_Number"));
			commodity.setSourceAdd(rs.getString("Source_Add"));
			commodity.setDestinationAdd(rs.getString("Destination_Add"));
			return commodity;
		}
	}

	public List<Commodity> findAll() {
		return jdbcTemplate.query("select * from commodity",new CommodityRowMapper());
	}

	public Optional<Commodity> findById(String Commodity_Detailes) {
		return Optional.of(jdbcTemplate.queryForObject("select * from commodity where id=?",
				new Object[] { Commodity_Detailes }, new BeanPropertyRowMapper<Commodity>(Commodity.class)));
	}

	public int deleteById(String CommodityDetailes) {
		return jdbcTemplate.update("delete from run where commodity=?", new Object[] { CommodityDetailes });
	}

	public int insert(Commodity commodity) {
		System.out.println( commodity.getCommodityDetailes());
		return jdbcTemplate.update(
				" insert into Commodity (Commodity_Detailes, Car_Name, Registration_Number, Source_Add, Destination_Add) "
						+ "values(?, ?, ?, ?, ?)",
				new Object[] {commodity.getCommodityDetailes(), commodity.getCarName(), commodity.getRegistrationNumber(), commodity.getSourceAdd(),
						commodity.getDestinationAdd()});
	}


	public int update(Commodity commodity) {
		return jdbcTemplate.update("update Commodity "
				+ " setCommodity_Detailes= ?, Car_Name = ?, Registration_Number = ?, Source_Add = ?, Destination_Add = ? "
				+ "where Commodity_Detailes = ?",
				new Object[] {commodity.getCommodityDetailes(), commodity.getCarName(), commodity.getRegistrationNumber(), commodity.getSourceAdd(),
						commodity.getDestinationAdd()
				});
	}
	
	}
	


