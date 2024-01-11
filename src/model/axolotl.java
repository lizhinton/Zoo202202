/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Jan 11, 2024
 */
package github;

public class axolotl {
	//create 3 instance variables
	private String name;
	private String color;
	private int length;
	
	//constructors
	axolotl(){
		name = "lottie";
		color = "pink";
		length = 8;
	}
	axolotl(String Name, String Color, int Length){
		name = Name;
		color = Color;
		length = Length;
	}
	//getters
	public String getName(){
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getLength() {
		return length;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setLength(int newLength) {
		length = newLength;
	}
	
	//speak method
	public String speak() {
		return "squeak";
	}
}