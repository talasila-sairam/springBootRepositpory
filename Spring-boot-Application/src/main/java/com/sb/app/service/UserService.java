package com.sb.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.app.dao.UserDao;
import com.sb.app.dto.UserDto;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	public List<UserDto> fetchUser(){
		
		return dao.fetchUsers();
	}

	public int savedata(UserDto dto){
		return dao.saveUser(dto);
	}
}
