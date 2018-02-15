package com.springboot.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.app.bo.AddressBO;

@Repository
public class UserAddresDao {
	
	@Autowired
	NamedParameterJdbcTemplate template;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private final String USER_ADDRESS="select c.contact_name ,c.flat ,c.city ,c.mobile from sys.contact c where c.zipcode=?";
	
    public UserAddresDao() {
	  System.out.println("inside UserAddresDao class constructor");
    }
    
   /*  This is with Named ParameterJdbcTemplate
    *  public List<AddressBO> getUserAddress(int zipcode) {
  	  System.out.println("inside getUserAddress method");  
  	  List<AddressBO> listAddressBo = null;
  	  Map map = new HashMap();
  	  map.put("zipcode", zipcode);
  	  return template.query(USER_ADDRESS, map,(rs , rowNo) ->{
			System.out.println("inside maprow method");
			AddressBO addressBo = null;
			addressBo = new AddressBO();
			addressBo.setName(rs.getString(1));
			addressBo.sethNo(rs.getString(2));
			addressBo.setAddress(rs.getString(3));
			addressBo.setMobileNo(rs.getString(4));
			addressBo.setMobileNo(rs.getString(4));
			return addressBo;
  	  });
      }*/
  
    //This is with jdbcTemplate
    public List<AddressBO> getUserAddress(int zipcode) {
	  System.out.println("inside getUserAddress method");  
	  List<AddressBO> listAddressBo = null;
	  listAddressBo = jdbcTemplate.query(USER_ADDRESS, new Object[] {zipcode}, new RowMapper<AddressBO>() {
		@Override
		public AddressBO mapRow(ResultSet rs, int level) throws SQLException {
			System.out.println("inside maprow method");
			AddressBO addressBo = null;
			addressBo = new AddressBO();
			addressBo.setName(rs.getString(1));
			addressBo.sethNo(rs.getString(2));
			addressBo.setAddress(rs.getString(3));
			addressBo.setMobileNo(rs.getString(4));
			addressBo.setMobileNo(rs.getString(4));
			return addressBo;
		}  
	  });
	  return listAddressBo;
    }
}
