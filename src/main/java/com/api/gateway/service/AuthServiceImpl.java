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
		//UserCredential usercredential = null;
		AuthDetailsRequest authDetailDto = null;
		//usercredential = this.getDaoManager().getAuthDao().findByUserName(authDetails.getUsername());
	/*	if (usercredential != null && usercredential.getPassword().equals(authDetails.getPassword())) {
			if (Duration.between(usercredential.getTokenTime(), LocalTime.now()).toMinutes() > 5) {
				authDetailDto = new AuthDetailsRequest();
				authDetailDto.setStatus("Session time out");
				return authDetailDto;
			} e*//*lse {
				usercredential.setLastLoginTime(LocalDateTime.now());
				usercredential.setLoggedInUserIpAddress(authDetails.getLoggedInUserIpAddress());
				usercredential = this.getDaoManager().getAuthDao().saveUserCredential(usercredential);*/
				// UserRole userRole =
				// this.getDaoManager().getUserRole().getUserRoleById(usercredential);
				authDetailDto = new AuthDetailsRequest();
				authDetailDto.setStatus("Success");
				/*
				 * if (userRole != null) authDetailDto.setRoleId(userRole.getRoleId());
				 */
			/*	authDetailDto.setUserId(usercredential.getUserId());
				authDetailDto.setFullName(usercredential.getProfileId().getFullName());
*/
				authDetailDto.setJwtToken(jwtUtil.generateToken("hanmant"/*usercredential.getUserName()*/));
			//}
	/*
	 * } else { throw new RecordNotFound("user not found"); }
	 */
		return authDetailDto;
	}

}
