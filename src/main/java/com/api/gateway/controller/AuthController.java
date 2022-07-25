package com.api.gateway.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.model.request.AuthDetailsRequest;
import com.api.gateway.service.AuthSerivice;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	AuthSerivice authSerivice;

	@PostMapping("/login")
	public ResponseEntity<?> checkPassword(@RequestBody @Valid AuthDetailsRequest authDetails) {
		return ResponseEntity.ok(this.authSerivice.login(authDetails));
	}
}
