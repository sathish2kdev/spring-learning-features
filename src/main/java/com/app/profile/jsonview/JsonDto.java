package com.app.profile.jsonview;

import com.fasterxml.jackson.annotation.JsonView;

public class JsonDto {

	@JsonView(Views.ExternalView.class)
	private String loginId;

	@JsonView(Views.ExternalView.class)
	private String loginPassword;


	@JsonView(Views.InternalView.class)
	private String userName;


	@JsonView(Views.InternalView.class)
	private String userNumber;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

}
