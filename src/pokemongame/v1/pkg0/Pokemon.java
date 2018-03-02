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
public class Pokemon {
    private String name;
	private float weight;
	private float stepLength;
	private int step;
	private int energy;
	private float gainingWeightStep;
	private String[] types;

	public Pokemon(String name,float weight,float stepLength,float gainingWeightStep,String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
		step = 0;
		energy = 100;

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}
	public String getName() {
		return name;
	}

	public void walk(){
		step += 1;
		energy -= 10;
	}
	
	public void eat(){
		weight += gainingWeightStep;
                if(energy <= 99){
                    energy += 10;
                }
		
	}
	
	public void exercise() {
		weight -= gainingWeightStep;
		energy -= 30;
	}
	
	public void sleep() {
                step = 0;
                energy = 100;
                if(energy <= 99)
		energy+=2;
	}
	
	public void print(){
		System.out.println("----->name: " + name +"");
 		System.out.print("----->Type: ");
		for(String type: types){
			System.out.print(type);
		}
		System.out.println();
		System.out.print("----->Weight: " + weight);
		System.out.println(" kg");
		System.out.println("----->Energy: " + energy);
		System.out.println("----->Step length: " + stepLength);
		System.out.print("----->Today Step: " + step);
		System.out.println(" step");
		System.out.print("----->Total length: " + step*stepLength);
		System.out.println(" step");
		System.out.println("------------------------------------------");
	}
}
