package com.jujumarket.domain;


import java.sql.Timestamp;

import lombok.Data;

@Data
public class MhistoryVO {
	private String idno;
	private String condition;
	private Timestamp condiupdatedate;
	private String accountType;
}
