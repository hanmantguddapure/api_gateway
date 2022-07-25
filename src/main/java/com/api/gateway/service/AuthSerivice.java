package com.api.gateway.service;

import com.api.gateway.model.request.AuthDetailsRequest;

public interface AuthSerivice {
	public AuthDetailsRequest login(AuthDetailsRequest authDetails);
}
