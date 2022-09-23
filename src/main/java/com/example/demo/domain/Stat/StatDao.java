package com.example.demo.domain.Stat;

import java.util.List;

import com.example.demo.web.dto.response.StatRespDto;

public interface StatDao {
	public List<StatRespDto> findAll();
}
