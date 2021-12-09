package com.snakeandladder;

public class SnakeAndLadderGame {

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.position);
		
		//die rolling
		
		int diceValue = (int)(Math.floor(Math.random()*10)%6+1);
		System.out.println(diceValue);
	}

}
