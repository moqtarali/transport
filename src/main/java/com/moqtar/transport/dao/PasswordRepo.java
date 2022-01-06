package com.moqtar.transport.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.moqtar.transport.dao.entity.Password;

@Repository
public class PasswordRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	class PasswordRowMapper implements RowMapper<Password> {
		@Override
		public Password mapRow(ResultSet rs, int rowNum) throws SQLException {
			Password password = new Password();

			password.setOldPassword(rs.getString("Old_Password"));
			password.setNewPassword(rs.getString("New_Password"));
			password.setConformPassword(rs.getString("Conform_Password"));
			return password;
		}
	}

	public List<Password> findAll() {
		return jdbcTemplate.query("select * from Password", new PasswordRowMapper());
	}

	public Optional<Password> findByUserName(String User_Name) {
		return Optional.of(jdbcTemplate.queryForObject("select * from Password where id=?", new Object[] { User_Name },
				new BeanPropertyRowMapper<Password>(Password.class)));
	}

	public int deleteById(String UserName) {
		return jdbcTemplate.update("delete from run where commodity=?", new Object[] { UserName });
	}

	public int insert(Password password) {
		System.out.println(password.getConformPassword());
		return jdbcTemplate.update(
				"insert into userDetailes (Old_Password, New_Password, Conform_Passsword)" + "values(?, ?, ?)",
				new Object[] { password.getOldPassword(), password.getNewPassword(), password.getConformPassword(), });

	}

	public int update(Password password) {
		return jdbcTemplate.update(
				"update Password " + " set Old_Password= ?, New_Password=?, Conform_Passsword=?" + "where User_Name = ?",
				new Object[] { password.getOldPassword(), password.getNewPassword(), password.getConformPassword()

				});

	}

}
