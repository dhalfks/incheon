package com.myweb.www.domain;

import lombok.Data;

@Data // edit 3 : 비추천 > 불필요한 생성자도 생성됨
public class BoardVO {
	private long bno;
	private String title;
	private String content;
	private String writer;
	private String regAt;
	private String modAt;
	private int readCount;
	private int hasFile;
	private int cmtQty;
}
