/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Jan 11, 2024
 */
package github;

public class penguin {
	//create 3 instance variables
	private String name;
	private String species;
	private int height;
	
	//constructors
	penguin(){
		name = "thomas";
		species = "little blue";
		height = 2;
	}
	penguin(String Name, String Species, int Height){
		name = Name;
		species = Species;
		height = Height;
	}
	//getters
	public String getName(){
		return name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getHeight() {
		return height;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSpecies(String newSpecies) {
		species = newSpecies;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	//speak method
	public String speak() {
		return "squawk";
	}
}