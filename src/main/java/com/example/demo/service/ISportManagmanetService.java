package com.example.demo.service;

import java.util.List;

import com.example.demo.document.Player;

public interface ISportManagmanetService {
	public String registerPlayer(Player player);
	public List<Player>getAllPlayer();

}
