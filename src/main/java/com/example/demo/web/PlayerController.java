package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.player.Player;
import com.example.demo.domain.player.PlayerDao;
import com.example.demo.domain.team.TeamDao;
import com.example.demo.web.dto.response.PlayerUpdateRespDto;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PlayerController {
	private final TeamDao teamDao;
	private final PlayerDao playerDao;

	@GetMapping("/player")
	public String player(Model model) {
		System.out.println("실행테스트");
		model.addAttribute("players", playerDao.findAllJoin());
		return "player/player";
	}
	
	@GetMapping("/playerSaveForm")
	public String playerSave(Model model) {
		model.addAttribute("teams", teamDao.findAll());
		return "player/playerSaveForm";
	}
	
	@GetMapping("/playerUpdateForm/{id}/{name}")
	public String playerUpdate(@PathVariable int id,@PathVariable String name,Model model) {
		System.out.println(id+","+name);
		PlayerUpdateRespDto playerUpdateRespDto = PlayerUpdateRespDto.builder()
				.playerRespDto(playerDao.findByIdAndName(id, name))
				.teams(teamDao.findAll())
				.build();
		System.out.println(playerUpdateRespDto);
		model.addAttribute("respDto", playerUpdateRespDto);
		return "player/playerUpdateForm";
	}
	
	@PostMapping("/player")
	public @ResponseBody String playerSaveProc(Player player) {
		System.out.println("@PostMapping"+player);
		playerDao.save(player);
		return "완료";
	}
	
	@PutMapping("/player")
	public @ResponseBody String stardiumUpdateProc(Player player) {
		System.out.println("@PutMapping"+player);
		playerDao.update(player);
		return "완료";
	}
	
	@DeleteMapping("/player")
	public @ResponseBody String playerSaveProc(int id) {
		System.out.println("@DeleteMapping"+id);
		playerDao.deleteById(id);
		return "완료";
	}
}
