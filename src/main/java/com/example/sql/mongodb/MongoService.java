package com.example.sql.mongodb;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sql.agency.*;

@Service
public class MongoService {
	@Autowired
	Mongorepository mongoRepo;
	
	@Autowired
	AgencyRepository agencyRepo;
	
	
	public List<MongoEntity> getAll(){
		return mongoRepo.findAll();
	}
	
	
	public MongoEntity getHeroById(Long id) {
		
		return mongoRepo.findById(id).orElse(null);
	}
}
