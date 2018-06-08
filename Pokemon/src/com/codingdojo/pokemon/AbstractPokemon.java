package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println("Created Pokemon");
		String tempname = name;
		String temptype = type;
		int temphealth = health;
		Pokemon poke = new Pokemon(tempname, temphealth, temptype);
		return poke;
	}
	
	public void attackPokemon(Pokemon poke) {
		System.out.println("It is attacking!");
		int temp = 0;
		temp = poke.getHealth();
		temp -= 10;
		poke.setHealth(temp);
	}
	
	public abstract String pokemonInfo(Pokemon poke);
}
