package com.snakeandladder;

public class SnakeAndLadderGame {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static int rollingTheDie(Person person1) {
    	int dieRollCount = 0;
		while(person1.position!=100) {
			System.out.println("Rolling the Die");
			dieRollCount++;
			//die rolling
			int diceValue = (int)(Math.floor(Math.random()*10)%6+1);
			System.out.println("Die Value came as: " +diceValue);
			
			//check options
			int option = (int)(Math.floor(Math.random()*10)%3);
			System.out.println("player got a: " +option);
			
			switch (option) {
			case NO_PLAY:{
				
				break;
			  }
			case LADDER:{
				int playerPosition = person1.position;
				playerPosition = playerPosition+diceValue;
				System.out.println("New position evaluated to "+playerPosition);
				if(playerPosition>100)
					System.out.println("You Stay Where You Are");
				else
					person1.position = playerPosition;
				rollingTheDie(person1);
				break;
			  }
			case SNAKE:{
				person1.position = person1.position - diceValue;
				if(person1.position<0)
					person1.position = 0;
				break;
			  }
			}
			System.out.println("New position is  "+ person1.position);
			
			System.out.println("______________________");
		}
		return dieRollCount;
    }
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		System.out.println("Rolling For Player1");
		int person1DieRollCount = rollingTheDie(person1);
		System.out.println("Rolling For Player2");
		int person2DieRollCount = rollingTheDie(person2);
		System.out.println("Rolling For Player1");
		System.out.println("Player1 rolled "+ person1DieRollCount+ " times");
		System.out.println("Player2 rolled "+ person2DieRollCount+ " times");
		if (person1DieRollCount<person2DieRollCount) {
			System.out.println("PLAYER1 WINS");
		} else {
			System.out.println("PLAYER2 WINS");
		}
		
		
		
	}
}
