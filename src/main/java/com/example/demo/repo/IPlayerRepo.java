package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.Player;

public interface IPlayerRepo extends MongoRepository<Player, Integer> {

}
