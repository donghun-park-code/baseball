package com.example.demo.web.dto.response;

import java.util.List;

import com.example.demo.domain.team.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerUpdateRespDto {
	private PlayerRespDto playerRespDto;
	private List<Team> teams;
}
