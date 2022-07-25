package org.zerock.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardDTO {

	private Long bno;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate;
	private Date updatedate;
	
	public BoardDTO() {
		super();
	}

	public BoardDTO(Long bno, String content, Date regdate, Date updatedate) {
		super();
		this.bno = bno;
		this.content = content;
		
	}
	public Long getbno() {
		return bno;
	}
	public 	void setbno(Long bno) {
		this.bno = bno;
	}
	public String content() {
		return content;
	}
	public void setcontent(String content) {
		this.content = content;
	}
}
