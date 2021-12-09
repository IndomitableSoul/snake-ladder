package com.snakeandladder;

public class SnakeAndLadderGame {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.position);
		
		//die rolling
		
		int diceValue = (int)(Math.floor(Math.random()*10)%6+1);
		System.out.println(diceValue);
		
		//check options
		int option = (int)(Math.floor(Math.random()*10)%3);
		System.out.println(option);
		
		switch (option) {
		case NO_PLAY:{
			
			break;
		  }
		case LADDER:{
			person1.position = person1.position + diceValue;
			break;
		  }
		case SNAKE:{
			person1.position = person1.position - diceValue;
			break;
		  }
		}
		System.out.println(person1.position);
	}
}
