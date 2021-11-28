package com.moqtar.transport.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.moqtar.transport.dao.entity.UserDetailes;

@Repository
public class UserDetailesRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;

	class UserDetailesRowMapper implements RowMapper<UserDetailes> {
		@Override
		public UserDetailes mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserDetailes userDetailes = new UserDetailes();
			userDetailes.setFullName(rs.getString("Full_name"));
			userDetailes.setLastName(rs.getString("Last_name"));
			userDetailes.setUserName(rs.getString("User_Name"));
			userDetailes.setPswd(rs.getString("Pswd"));
			userDetailes.setEmail(rs.getString("E_mail"));
			userDetailes.setDOfB(rs.getString("Dof_B"));
			userDetailes.setAddress(rs.getString("Address"));
			userDetailes.setMobNumber(rs.getString("Mob_Number"));

			return userDetailes;
		}
	}

	public List<UserDetailes> findAll() {
		return jdbcTemplate.query("select * from userDetailes", new UserDetailesRowMapper());
	}

	public Optional<UserDetailes> findById(String User_Name) {
		return Optional.of(jdbcTemplate.queryForObject("select * from userDetailes where id=?",
				new Object[] { User_Name }, new BeanPropertyRowMapper<UserDetailes>(UserDetailes.class)));
	}

	public int deleteById(String UserName) {
		return jdbcTemplate.update("delete from employees where UserName=?", new Object[] { UserName });
	}

	public int insert(UserDetailes userDetailes) {
		System.out.println(userDetailes.getFullName());
		return jdbcTemplate.update(
				"insert into userDetailes (Full_name, Last_name, User_Name, Pswd, E_mail, Dof_B, Address, Mob_Number)"
						+ "values(?, ?, ?, ? ,? ,? ,? ,?)",
				new Object[] { userDetailes.getFullName(), userDetailes.getLastName(), userDetailes.getUserName(),
						userDetailes.getPswd(), userDetailes.getEmail(), userDetailes.getDOfB(),
						userDetailes.getAddress(), userDetailes.getMobNumber() });
	}

	public int update(UserDetailes userDetailes) {
		return jdbcTemplate.update("update userDetailes "
				+ " set Full_name = ?, Last_name = ?, UserName = ?, Pswd = ?, E_mail =  ?, Dof_B = ?, Address = ?, Mob_Number = ? "
				+ "where User_Name = ?",
				new Object[] { userDetailes.getFullName(), userDetailes.getLastName(), userDetailes.getUserName(),
						userDetailes.getPswd(), userDetailes.getEmail(), userDetailes.getDOfB(),
						userDetailes.getAddress(), userDetailes.getMobNumber()

				});
	}

}
