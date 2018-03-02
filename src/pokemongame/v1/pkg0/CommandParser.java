/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame_v.pkg2;

/**
 *
 * @author Raweeroj
 */
import java.util.Scanner;
import java.util.Random; 
public class CommandParser {
        private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
	private String type;
        private Scanner sc = new Scanner(System.in);
        Random rand = new Random();

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;

		while(isRunning){
                        System.out.println("=================================================");
			System.out.println("Enter commands:");
                        System.out.println("[list][feed][ex][walk][sleep][q/uit]");
                        System.out.print(": ");
			String command = commandScanner.next();
			if(command.equals("q")){
				isRunning = false;
                               
			}
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

	private void addPokemon(String monName){
                System.out.println(monName);
		System.out.print("Input Name: ");
		String name = commandScanner.next();
		System.out.print("Input weight(kg): ");
		float weight = commandScanner.nextFloat();
		System.out.print("Input step length: ");
		float stepLength = commandScanner.nextFloat();

		if(monName.equals("lugia")){
			Lugia lugia = new Lugia(name, weight, stepLength);
			pokemonFarm.addPokemon(lugia);
		}
                else if(monName.equals("groudon")){
			Groudon groudon = new Groudon(name, weight, stepLength);
			pokemonFarm.addPokemon(groudon);
		}
                run();
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
        
        
        //catch pokemon
        public void intoForrest(){
                String name[] = {"Lugia","Groudon"};
                String monName = name[(int)rand.nextInt(3)];
                int step = (int) (Math.random()*10);
                System.out.println("=================================================");
                try {

                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println("วันหนึ่งฉันเดินเข้าป่า");
                } catch (InterruptedException e) {
                    }
                int i = 0;
                while(i < step){
                try {
                    System.out.println(".");
                    Thread.sleep((long) (Math.random()*1000));            
                    } 
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
                 i++;            
                }
                System.out.println("step walk = "+step);
                System.out.println("Found it --->"+ monName +"<--- !!");
        
                catchMon(monName);
        }
        
        private void catchMon(String monName){
        
                int mood = rand.nextInt(10)+1;
                int ball = selectBall();
                int result = 0;
                int i = 0;
                int step = (int)Math.random()*10;
                while(i < step){
                    try {
                        System.out.println(".");
                        Thread.sleep((long) (Math.random()*1000));            
                        } 
                    catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                    i++;            
                }
                if(ball==1){
                        result = mood*8;
                }
                else if(ball==2){
                        result = mood*9; 
                }
                else if(ball==3){
                        result = mood*10; 
                }
                try {
                        Thread.sleep(500);
                        System.out.println(".");
                        Thread.sleep(500);
                        System.out.println(".");
                        Thread.sleep(500);
                        System.out.println(".");
                } catch (InterruptedException e) {
                }
                this.captureSuccess(result, monName);
        }
        
       private void captureSuccess(int result, String monName){
        if(result >= 50){       
            System.out.println("Success");
            System.out.println("===============================================");
            addPokemon(monName);
        }
        else{
		
                System.out.println("Fail");
                try {
                    Thread.sleep(500);
                    System.out.print(". ");
                    Thread.sleep(500);
                    System.out.print(". ");
                    Thread.sleep(500);
                    System.out.print(". ");
                    Thread.sleep(500);
                    System.out.println("Pokemon has gone !!!");
                } catch (InterruptedException e) {
                }       
        System.out.println("==================================================");
        }
    }
    
    private int selectBall(){
        System.out.println("\nChoose Ball:");
        System.out.println("1 is Pokeball");
        System.out.println("2 is Masterball");
        System.out.println("3 is Ultraball");
        System.out.print(">: ");
        int ball = sc.nextInt();
        return ball;
    }
    
    private void evolutionAddPokemon(String pokemonType)
  {
    System.out.print("Name:");
    String name = this.sc.nextLine();
    float weight = (float)Math.random() * 100.0F;
    float stepLength = (float)Math.random() * 5.0F;
    if(pokemonType.equals("Wartortle"))
    {
      Lugia lugia = new Lugia(name, weight*2F, stepLength*2F);
      this.pokemonFarm.addPokemon(lugia);
    }
    if(pokemonType.equals("Blastoise"))
    {
      Groudon groudon = new Groudon(name, weight*3F, stepLength*3F);
      this.pokemonFarm.addPokemon(groudon);
    }

  }
}
