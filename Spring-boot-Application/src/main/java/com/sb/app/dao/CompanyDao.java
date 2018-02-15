package com.sb.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.sb.app.dto.CompanyDto;

public class CompanyDao {
	@Autowired
	NamedParameterJdbcTemplate jdbctemplate;
	public int SaveJob(CompanyDto cdto){
		return 0;
		
	}
}
