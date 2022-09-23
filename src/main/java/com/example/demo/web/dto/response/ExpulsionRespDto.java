package com.example.demo.web.dto.response;

import java.util.List;

import com.example.demo.domain.team.Team;
import com.example.demo.web.dto.ExpulsionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpulsionRespDto {
	List<Team> Teams;
	List<ExpulsionDto> expulsionDtos;
}
