package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Expulsion.Expulsion;
import com.example.demo.domain.Expulsion.ExpulsionDao;
import com.example.demo.domain.player.PlayerDao;
import com.example.demo.domain.team.TeamDao;
import com.example.demo.web.dto.response.CommonRespDto;
import com.example.demo.web.dto.response.ExpulsionRespDto;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ExpulsionController {

	private final ExpulsionDao expulsionDao;
	private final PlayerDao playerDao; 
	private final TeamDao teamDao;
	
	@GetMapping("/expulsion")
	public String expulsion(Model model) {
		ExpulsionRespDto respDto = ExpulsionRespDto.builder()
				.Teams(teamDao.findAll())
				.expulsionDtos(expulsionDao.findAll(1))
				.build();
		System.out.println(respDto);
		model.addAttribute("respDto", respDto);
		return "expulsion/expulsion";
	}
	
	//여기서 id는 teamId
	@GetMapping("/expulsion/{id}")
	public @ResponseBody CommonRespDto<?> expulsionGet(@PathVariable int id, Model model) {
		ExpulsionRespDto respDto = ExpulsionRespDto.builder()
				.Teams(teamDao.findAll())
				.expulsionDtos(expulsionDao.findAll(id))
				.build();
		System.out.println(respDto);
		return new CommonRespDto<ExpulsionRespDto>(1, respDto);
	}
	
	@GetMapping("/expulsionSaveForm")
	public String expulsionSave(Model model) {
		model.addAttribute("players", playerDao.findAll());
		return "expulsion/expulsionSaveForm";
	}
	
	@PostMapping("/expulsion")
	public String expulsionSaveProc(Expulsion expulsion) {
		expulsionDao.save(expulsion);
		return "expulsion/expulsionSaveForm";
	}
}