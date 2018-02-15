package com.sb.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sb.app.dto.UserDto;

@Repository
public class UserDao {
	private final String SQL_FETCH_USERS="SELECT USER_ID,USER_FNAME,USER_LNAME,GENDER,STATE,ZIP,MOBILE,EMAIL,PASSWORD,ACTIVE_STATUS from user_tbl where USER_ID=:uid";
	private final String INSERT_USER="INSERT INTO user_tbl(USER_FNAME,USER_LNAME,GENDER,STATE,ZIP,MOBILE,EMAIL,PASSWORD,ACTIVE_STATUS) values(:user_fname,:user_lname,:gender,:state,:zip,:mobile,:email,:password,:active_status)";
	@Autowired
	NamedParameterJdbcTemplate template;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<UserDto> fetchUsers(){
    Map mp=new HashMap(); 
    mp.put("uid", 49);
    return template.query(SQL_FETCH_USERS,mp,(resultSet, rowNum) ->{

           UserDto dto=new UserDto();
           dto.setActive_status(resultSet.getInt(10));
           dto.setEmail(resultSet.getString(8));
           dto.setGender(resultSet.getString(4));
           dto.setMobile(resultSet.getString(7));
           dto.setState(resultSet.getString(5));
           dto.setUser_fname(resultSet.getString(2));
           dto.setUser_lname(resultSet.getString(3));
           dto.setUser_id(resultSet.getInt(1));
           dto.setZip(resultSet.getString(6));
            return dto;

        });
		
	}
	
	public int saveUser(UserDto dto){
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("user_fname",dto.getUser_fname());
		params.addValue("user_lname", dto.getUser_lname());
		params.addValue("gender", dto.getGender());
		params.addValue("state", dto.getState());
		params.addValue("zip", dto.getZip());
		params.addValue("mobile", dto.getMobile());
		params.addValue("email", dto.getEmail());
		params.addValue("password", dto.getPassword());
		params.addValue("active_status", dto.getActive_status());
		
		return template.update(INSERT_USER, params);
	}

}
