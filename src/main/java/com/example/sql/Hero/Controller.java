package com.example.sql.Hero;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/heros")
public class Controller {

	@Autowired
	Repository heroRepo;
	
	@GetMapping("")
	public List<Model> getHeros(){
		return heroRepo.findAll();
	}
	@PostMapping("")
	public Model addHero(@RequestBody Model model) {
		
		return heroRepo.save(model);
	}
	@GetMapping("/{id}")
	public Model getHero(@PathVariable Long id) {
		return heroRepo.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Model updateHero(@PathVariable Long id,@RequestBody Model hero) {
		Model newHero = heroRepo.findById(id).orElse(null);
		newHero.setName(hero.getName());
		heroRepo.save(newHero);
		return heroRepo.findById(id).orElse(null);
	}
	@DeleteMapping("/{id}")
	public String upateHero(@PathVariable Long id) {
		heroRepo.deleteById(id);
		return "deleted the Hero with id:" + id;
	}
	
	@PutMapping("")
	public List<Model> updateAll(){
		
		return heroRepo.findAll();
	}
}	
