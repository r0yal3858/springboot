package com.example.sql.agency;

import java.util.*;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name="agency")
public class Agency {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private Long _id;
	
	@Column(name="name")
	private String name;
	@Column(name="universe")
	private String universe;
	@Column(name="heros",nullable=true)
	private List<String> heros = new ArrayList<>();
	
	public Long getId() {
		return _id;
	}
	public String getName() {
		return name;
	}
	public String getUniverser() {
		return universe;
	}
	public List<String> getHeros(){
		return heros;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public void setUniverse(String universe) {
		this.universe = universe;
	}
	public void addHero(String name) {
		heros.add(name);	
	}
	public void removeHero(String name) {
		heros.remove(name);
	}
	
	@Override
	public String toString() {
		return name+"\t belongs to the universe "+universe+" has a list of heros of "+ heros;
	}
	
}
