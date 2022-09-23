package com.example.demo.domain.player;

import java.util.List;

import com.example.demo.web.dto.response.PlayerRespDto;

public interface PlayerDao {

	public void save(Player player);

	public List<Player> findAll();

	public List<PlayerRespDto> findAllJoin();

	public void deleteById(int id);

	public PlayerRespDto findByIdAndName(int id, String name);

	public void update(Player player);
}
