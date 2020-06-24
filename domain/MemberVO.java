package com.jujumarket.domain;

import lombok.Data;

@Data
public class MemberVO {
	private Long idno;
	private String emailaccount;
	private String memname;
	private String memcode;
	private String memaddr;
}
