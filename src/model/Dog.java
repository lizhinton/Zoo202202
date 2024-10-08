/**
 * Spencer Cress - scress
 * 202202 CIS 175 26703
 * Jan 11, 2022
 */

package model;

public class Dog {
	private String name;
	private String color;
	private int age;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String speak() {
		return "Woof!";
	}

}