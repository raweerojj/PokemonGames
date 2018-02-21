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
import java.util.Scanner;
public class CommandParser {
        private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
	private String type;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;

		System.out.println("-----------Welcome to Pokemon Game-----------");
		while(isRunning){
                        System.out.println("---------------------------------------------");
			System.out.println("Enter commands:");
                        System.out.println("[select][list][feed][ex][walk][sleep][quit]");
                        System.out.print(": ");
			String command = commandScanner.next();
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("select"))
                            addPokemon();
			else if(command.equals("list"))
                            listPokemons();
			else if(command.equals("feed"))
                            feedPokemons();
			else if(command.equals("ex"))
                            exercisePokemons();
			else if(command.equals("walk"))
                            walkPokemons();
			else if(command.equals("sleep"))
                            sleepPokemons();
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
                System.out.println("---------------------------------------------");
		System.out.println("->Select Pokemon");
		System.out.println("  |-->lugia");
                System.out.println("  |-->Groudon");
                System.out.println("---------------------------------------------");
		System.out.print("Choose it: ");
		String pokemonType = commandScanner.next();
		System.out.print("Input Name: ");
		String name = commandScanner.next();
		System.out.print("Input weight(kg): ");
		float weight = commandScanner.nextFloat();
		System.out.print("Input step length: ");
		float stepLength = commandScanner.nextFloat();

		if(pokemonType.equals("lugia")){
			Lugia lugia = new Lugia(name, weight, stepLength);
			pokemonFarm.addPokemon(lugia);
		}
                else if(pokemonType.equals("groudon")){
			Groudon groudon = new Groudon(name, weight, stepLength);
			pokemonFarm.addPokemon(groudon);
		}
	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		this.pokemonFarm.list();
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
		else{
			this.pokemonFarm.feed(name);
		}
	}
	
	private void exercisePokemons() {
		System.out.print("Which pokemon do you want to exercis?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.exercise("all");
		}
		else{
			this.pokemonFarm.exercise(name);
		}
	}
	
	private void walkPokemons() {
		System.out.print("Which pokemon do you want to walk?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.walk("all");
		}
		else{
			this.pokemonFarm.walk(name);
		}
	}
	
	private void sleepPokemons() {
		System.out.print("Which pokemon do you want to sleep?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.sleep("all");
		}
		else{
			this.pokemonFarm.sleep(name);
		}
	}
}
