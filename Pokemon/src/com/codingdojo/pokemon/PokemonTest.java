package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon tempA;
		Pokemon tempB;
		String result = "";
		
		Pokedex poke = new Pokedex();
		tempA = poke.createPokemon("Waterman", 100, "Thrower");
		tempB = poke.createPokemon("Stinger", 463, "Needle");
		
		poke.attackPokemon(tempA);
		poke.attackPokemon(tempA);
		poke.attackPokemon(tempB);
		poke.attackPokemon(tempB);
		poke.attackPokemon(tempB);
		poke.attackPokemon(tempB);
		
		result = poke.pokemonInfo(tempA);
		System.out.println(result);
		result = poke.pokemonInfo(tempB);
		System.out.println(result);
		
		System.out.println("From the class " + tempA);
		System.out.println("From the class " + tempB);
		
		tempA.displayAll();
	}
}
