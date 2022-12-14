package com.example.demo.web.dto.response;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerRespDto {
	private int id;
	private String teamName;
	private String position;
	private String playerName;
	private Timestamp createDate;
	private int no;
}
