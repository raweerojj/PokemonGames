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
import java.util.*;
import java.util.Scanner;
public class PokemonGame {
    
        public static void main(String[] args){
            Scanner commandScanner = new Scanner(System.in);
            boolean isRunning = false;
                
		PokemonFarm pokemonFarm = new PokemonFarm();
		CommandParser commandParser = new CommandParser(pokemonFarm);
                isRunning = true;
		
                while(isRunning){
                    try {
                        System.out.println("----------------------LOADING----------------------");
                        Thread.sleep((long) (Math.random()*1000));
                        System.out.println("----------------------LOADING----------------------");
                        Thread.sleep((long) (Math.random()*1000));
                        System.out.println("----------------------LOADING----------------------");
                        Thread.sleep((long) (Math.random()*1000));
                        
                        } 
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("==================================================");
                    System.out.println("--------------Welcome to Pokemon Game-------------");
                    System.out.println("==================================================");
                    System.out.println("=                                                =");
                    System.out.println("=   CatchPokemon [c]           Esc [x]           =");
                    System.out.println("=   PokemonFarm  [p]                             =");
                    System.out.println("=                                                =");
                    System.out.print("=   >: ");
                    do{
                    String command = commandScanner.next();
			if(command.equals("x")){
				isRunning = false;
				System.out.println("==================================================");
                                break;
			}
                        else if(command.equals("c")){
				commandParser.intoForrest();
                                break;
			}
                        else if(command.equals("p")){
				commandParser.run();     
                                break;
			}
                        System.out.print("=   >: ");
                    }while(true);
                    
                }
	}
}
