package com.example.demo.domain.stardium;

import java.util.List;

public interface StadiumDao {
	public void save(Stadium stadium);

	public List<Stadium> findAll();

	public void deleteById(int id);

	public Stadium findByIdAndName(int id, String name);

	public void update(Stadium stadium);
}
