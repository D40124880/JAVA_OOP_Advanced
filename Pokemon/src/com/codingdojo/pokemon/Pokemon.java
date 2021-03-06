package com.codingdojo.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	//constructor
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	};
	
	//mutators
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	// accessors
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public String getType() {
		return this.type;
	}
	
	// methods
	public void displayAll() {
		System.out.println("There are "+ count + " Pokemons created!");
	}
	
	@Override
	public String toString(){
	  return "Pokemon{" + "Name: " + name + " Health: " + health + " Type: " + type +  "}";
	}
}
