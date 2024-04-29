package com.example.sql.agency;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/agency")
public class AgencyController {
	
	@Autowired
	AgencyRepository agencyRepo;
	
	@GetMapping("/test")
	public String test() {
		return "working fine";
	}
	@GetMapping("")
	public List<Agency> getAgencies(){
		return agencyRepo.findAll();
	}
	@PostMapping("")
	public Agency addAgency(@RequestBody Agency agency) {
		return agencyRepo.save(agency);
	}
	@GetMapping("/{id}")
	public Agency getAgencyById(@PathVariable Long id) {
		return agencyRepo.findById(id).orElse(null);
	}
	@PostMapping("/{id}")
	public Agency addHero(@PathVariable Long id,@RequestBody Map<String,String> hero) {
		Agency agency = agencyRepo.findById(id).orElse(null);
		agency.addHero(hero.get("hero"));
		
		return agencyRepo.save(agency);
	}
	@PutMapping("/{id}")
	public Agency updateAgency(@PathVariable Long id,@RequestBody Agency agency) {
		Agency update = agencyRepo.findById(id).orElse(null);
		update.setName(agency.getName());
		agencyRepo.save(update);
		return agencyRepo.findById(id).orElse(null);
	}
	@DeleteMapping("/{id}")
	public String deleteAgency(@PathVariable Long id) {
		agencyRepo.deleteById(id);
		return "deleted agency successfully";
	}
	
}
