package com.jeffreyahn.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pd = new Pokedex();
		Pokemon bulbasaur = pd.createPokemon("Bulbasaur", 100, "Grass");
		System.out.println(pd.pokemonInfo(bulbasaur));
	}

}
