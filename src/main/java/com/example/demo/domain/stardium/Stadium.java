package com.example.demo.domain.stardium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stadium {
	private	int id;
	private	String name;
	private	Timestamp createDate;
}