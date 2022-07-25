package com.api.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.gateway.model.request.AuthDetailsRequest;
import com.api.gateway.utils.JwtUtil;

@Service
public class AuthServiceImpl implements AuthSerivice {

	@Autowired
	JwtUtil jwtUtil;

	@Override
	public AuthDetailsRequest login(AuthDetailsRequest authDetails) {
		AuthDetailsRequest authDetailDto = null;
		authDetailDto = new AuthDetailsRequest();
		authDetailDto.setStatus("Success");
		authDetailDto.setJwtToken(jwtUtil.generateToken("hanmant"/* usercredential.getUserName() */));
		return authDetailDto;
	}

}