package com.zeus.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

// 클래스를 직렬화시키는 방법
@Data
public class Board implements Serializable {

	private static final long serialVersionUID = 1L;
	// 멤버변수
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;

}
