package com.api.gateway.model.request;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthDetailsRequest {
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	private String fullName;
	private String status;
	private String jwtToken;
	private Long roleId;
	private Long userId;
	private String loggedInUserIpAddress;
}
