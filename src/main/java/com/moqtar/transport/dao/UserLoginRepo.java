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

import com.moqtar.transport.dao.entity.UserLogin;
import com.moqtar.transport.dao.entity.Commodity;
import com.moqtar.transport.dao.entity.UserDetailes;

@Repository
public class UserLoginRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class UserLoginRowMapper implements RowMapper < UserLogin > {
        @Override
        public UserLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
            UserLogin userLogin = new UserLogin();
            userLogin.setUserName(rs.getString("user_name"));
            userLogin.setPwd(rs.getString("pwd"));
            
            return userLogin;
        }
    }

    public List < UserLogin > findAll() {
        return jdbcTemplate.query("select * from userlogin", new UserLoginRowMapper());
    }

    public UserLogin findByUserNameAndPassword(String userName, String pwd) {
        return jdbcTemplate.queryForObject("select * from userLogin where user_name=? and pwd =? ", new Object[] {
            userName, pwd
            },
            new BeanPropertyRowMapper < UserLogin > (UserLogin.class));
    }

    public int insert(UserDetailes userDetailes) {
		System.out.println(userDetailes.getFullName());
		return jdbcTemplate.update(
				"insert into userLogin (user_name, pwd)"
						+ "values(?, ?)",
				new Object[] {  userDetailes.getUserName(),
						userDetailes.getPswd() });
	}
    public int insert(Commodity run) {
		System.out.println(run.getCarName());
		return jdbcTemplate.update(
				"insert into userLogin (user_name, pwd)"
						+ "values(?, ?)",
				new Object[] {  run.getSourceAdd(),
						run.getDestinationAdd() });
	}


     
}