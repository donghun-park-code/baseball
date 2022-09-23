package com.example.demo.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Stat.StatDao;
import com.example.demo.web.dto.response.StatRespDto;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class IndexController {
	
	private final StatDao statDao;
	
	@GetMapping({"","/"})
	public String test() {
		return "index";
	}
	
	@GetMapping("/position")
	public String position(Model model) {
		List<StatRespDto> respDto = statDao.findAll();
		model.addAttribute("stats", respDto);
		System.out.println(respDto);
		return "stat/statistics";
	}
}
