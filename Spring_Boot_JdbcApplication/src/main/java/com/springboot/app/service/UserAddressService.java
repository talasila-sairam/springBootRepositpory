package com.springboot.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.bo.AddressBO;
import com.springboot.app.dao.UserAddresDao;
import com.springboot.app.dto.UserAddressDTO;

@Service
public class UserAddressService {
	
	@Autowired
	UserAddresDao userAddressDao;
	
    public UserAddressService() {
	  System.out.println("inside UserAddress Service class constructor");
    }
  
    public List<UserAddressDTO> getUserAddress(int zipcode){
    	System.out.println("inside getUserAddress method");
    	
    	UserAddressDTO userAddressDTO = null;
    	List<UserAddressDTO> listAddressDto = null;
	    List<AddressBO> listAddressBo =  userAddressDao.getUserAddress(zipcode);
	    listAddressDto = new ArrayList<UserAddressDTO>();
	    for(AddressBO address : listAddressBo) {
		 userAddressDTO = new UserAddressDTO();
		 userAddressDTO.setAddress(address.getAddress());
		 userAddressDTO.sethNo(address.gethNo());
		 userAddressDTO.setMobileNo(address.getMobileNo());
		 userAddressDTO.setName(address.getName());
		 listAddressDto.add(userAddressDTO);
	    }
	    return listAddressDto;
    }
  
}
