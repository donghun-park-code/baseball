package com.example.demo.domain.team;

import java.util.List;

import com.example.demo.web.dto.response.TeamRespDto;

public interface TeamDao {

	public void save(Team team);

	public List<Team> findAllJoin();

	public List<Team> findAll();

	public void deleteById(int id);

	public TeamRespDto findByIdAndName(int id, String name);

	public void update(Team team);

}
