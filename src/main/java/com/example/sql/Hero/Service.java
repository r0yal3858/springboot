//package com.example.sql.Hero;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//@Service
//public class Service {
//	@Autowired
//	Mongorepository mongoRepo;
//	
//}

/**
 * package com.example.firstproject;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class applicationService {

    @Autowired
    applicationRepository userRepository;
    
   
    // Example methods
    public List<Hero> getAllUsers() {
        return userRepository.findAll();
    }

    public Hero getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
    
    public Hero addHero(Hero newHero) {
    	Hero addedHero = userRepository.save(newHero);
    	return addedHero;
    }	
    
    public Hero updatePutHero(String id, String name) {
    	Optional<Hero> myHero = userRepository.findById(id);
    	
    	if (myHero.isPresent()) {
            Hero user = myHero.get();
            
            user.setName(name);
            return userRepository.save(user);
        } else {
            // Handle case where user with the given ID is not found
            return null;
        }

    }
    public Hero updatePostHero(String id, String name) {
    	Optional<Hero> myHero = userRepository.findById(id);
    	
    	if (myHero.isPresent()) {
            Hero user = myHero.get();
            
            user.setName(name);
            return userRepository.save(user);
        } else {
            // Handle case where user with the given ID is not found
            return null;
        }

    }

    // Add more methods for CRUD operations
}


 */
