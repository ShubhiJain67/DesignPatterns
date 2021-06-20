package client;

import interfaces.*;
import utility.*;

public class Human implements IWrokingHuman{
	public String name;
	public int age;
	public Gender gender;
	public String job = "\nI can do Household Chores";
	
	public Human(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public void canWalk() {
		System.out.println(this.name + " can walk.");
	}
	
	@Override
	public void canTalk() {
		System.out.println(this.name + " can talk.");
	}
	
	@Override
	public void canEat() {
		System.out.println(this.name + " can eat.");
	}
	
	@Override
	public void canBreath() {
		System.out.println(this.name + " can breath.");
	}
	
	@Override
	public void work() {
		System.out.println(job);
	}
	
	@Override
	public String toString() {
		String human = "Hi My Name is " + this.name + "\nI am " + this.age + " years old.\nI am a " + this.gender + job;
		return human;
	}
}