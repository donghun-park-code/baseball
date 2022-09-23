package com.example.demo.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatRespDto {
	private String position;
	private String LG;
	private String Kiwoom;
	private String lotte;
}
