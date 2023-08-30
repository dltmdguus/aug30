package com.poseidon.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.poseidon.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);
	

}
