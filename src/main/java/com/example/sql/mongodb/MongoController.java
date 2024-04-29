package com.example.sql.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mongodb")
public class MongoController {

	@Autowired
	MongoService mongoService;
	@Autowired
	Mongorepository mongoRepo;
	@GetMapping("/")
	public String getAll() {
		return "getting data from the mongo repo";
	}
	
	@GetMapping("/all")
	public List<MongoEntity> getAllDocs(){
		return mongoService.getAll();
	}
	
	@PostMapping("/")
	public MongoEntity addHero(@RequestBody MongoEntity hero) {
		return mongoRepo.save(hero);
	}
	@GetMapping("/{id}")
	public MongoEntity getHero(@PathVariable Long id) {
		
//		return mongoRepo.findById(id).orElse(null);
		return mongoService.getHeroById(id);
	}
	
}
