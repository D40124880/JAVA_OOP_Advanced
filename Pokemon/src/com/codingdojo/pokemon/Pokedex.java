package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon {
	public Pokedex() {}
	
	@Override
	public String pokemonInfo(Pokemon poke) {
		System.out.println("In pokedex");
		String tempname = poke.getName();
		String temptype = poke.getType();
		int temphealth = poke.getHealth();
		
		String result = "";
		result = "The name of the pokemon is " + tempname + " and they are a type of " + temptype + " and currently have a health of " + temphealth;
		
		return result;
	}
}
