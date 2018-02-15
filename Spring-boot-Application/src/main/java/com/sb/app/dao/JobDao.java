package com.sb.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.sb.app.dto.JobDto;

public class JobDao {
	private final String INSERT_JOB="INSERT INTO job_tbl(JOB_ID, EXPERIENCE, QUALIFICATION, JOB_TYPE)VALUES(:job_id,:experience,:qualification,:job_type)";
	
	@Autowired
	NamedParameterJdbcTemplate jdbctemplate;
	public int SaveJob(JobDto jdto){
		return 0;
		
	}

}
