package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Player;
import com.example.demo.repo.IPlayerRepo;

@Service
public class SportsManagementServiceImpl implements ISportManagmanetService {
	
	@Autowired
	private IPlayerRepo playerRepo;

	@Override
	public String registerPlayer(Player player) {
		return "Player Register with id:: " + playerRepo.save(player).getPlayerId();
	}

	@Override
	public List<Player> getAllPlayer() {
		return playerRepo.findAll();
	}

}
