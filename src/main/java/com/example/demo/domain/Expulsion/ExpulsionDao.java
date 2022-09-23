package com.example.demo.domain.Expulsion;

import java.util.List;

import com.example.demo.web.dto.ExpulsionDto;

public interface ExpulsionDao {
	public List<ExpulsionDto> findAll(int teamId); 
	public void save(Expulsion expulsion);
}
