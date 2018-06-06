package com.jeffreyahn.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	public Pokedex() {
	}
	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String answer = "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
//		System.out.println(answer);
		return answer;
	}
}
