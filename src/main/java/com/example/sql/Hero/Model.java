package com.example.sql.Hero;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
@Entity
@Table(name="hero")
public class Model {
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name="power",nullable = true)
	private String power;
	
	public Model() {}
	public Model(String name, String description,String power) {
		this.name= name;
//		this._id = _id;
		this.description=description;
		this.power = power; 
	}
	public long getId() {
		return _id;
	}
	
	
	public String getPower() {
		return power;
	}
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
//	public void setId(long _id) {
//		this._id = _id;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description= description;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "name: "+ name+ "\n with id: "+ _id+"\n of description : "+description+"\n has a power"+ power;
	}
}
