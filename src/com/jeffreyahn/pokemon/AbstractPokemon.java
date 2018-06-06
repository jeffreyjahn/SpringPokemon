package com.jeffreyahn.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newMon = new Pokemon(name, health, type);
		System.out.println("Creating a new pokemon");
		return newMon;
	};
	public void attackPokemon(Pokemon pokemon) {
		int amount = pokemon.getHealth() - 10;
		System.out.println("Attacking a asdmaoskdmlcx,");
		pokemon.setHealth(amount);
	};
	public abstract String  pokemonInfo(Pokemon pokemon);
}
