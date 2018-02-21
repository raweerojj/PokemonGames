/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame.v1.pkg0;

/**
 *
 * @author Raweeroj
 */
import java.util.ArrayList;
public class PokemonFarm {
    private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
		else {
			for(Pokemon pokemon: pokemons) {
                            if(pokemonName.equals("lugia")){
                                pokemon.eat();
                            }
				
			}		
		}
	}
	
	public void exercise(String pokemonName) {
			if(pokemonName.equals("all")){
				for(Pokemon pokemon: pokemons){
					pokemon.exercise();
				}
			}
			else {
				for(Pokemon pokemon: pokemons) {
					if(pokemonName.equals("lugia")){
						pokemon.exercise();
					}
				}
			}
	}
	
	public void walk(String pokemonName) {
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.walk();
			}
		}
		else {
			for(Pokemon pokemon: pokemons) {
				if(pokemonName.equals("lugia")){
					pokemon.walk();
				}
			}
		}
	}
	
	public void sleep(String pokemonName) {
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.sleep();
			}
		}
		else {
			for(Pokemon pokemon: pokemons) {
				if(pokemonName.equals("lugia")){
					pokemon.sleep();
				}
			}
		}
	}
}
