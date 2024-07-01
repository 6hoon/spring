package com.zeus.domain;

import lombok.ToString;

@ToString(exclude = { "userName" })
public class Member {
	private String userid;
	private String userName;
	private String password;
}
