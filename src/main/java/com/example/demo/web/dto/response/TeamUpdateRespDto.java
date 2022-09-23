package com.example.demo.web.dto.response;

import java.util.List;

import com.example.demo.domain.stardium.Stadium;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamUpdateRespDto {
	private TeamRespDto teamRespDto;
	private List<Stadium> stadiums;
}