package com.example.sbrestapi.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int boardId;
	private int studentsId;
	private String title;
	private String content;
	private String updateAt;
	private String createAt;
	private int cnt; //조회 수
}
