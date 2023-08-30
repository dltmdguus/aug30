package com.poseidon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.poseidon.web.dto.LoginDTO;
import com.poseidon.web.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO dto) {
		System.out.println(dto.toString());	
		LoginDTO result = loginService.login(dto); //count(*) 이름, 아이디
		return "login";
	}
}
