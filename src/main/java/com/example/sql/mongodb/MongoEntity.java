package com.example.sql.mongodb;

import javax.persistence.Id;
//import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="heros")
public class MongoEntity {
	@Id
	private Long _id;
	
	private String name;
	private String description;
	
	public MongoEntity(String name,String description) {
		this.name = name;
		this.description = description;
	}
	
	public Long getId() {
		return _id;
	}
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "name of the hero "+name+"\n "+description;
	}
}
