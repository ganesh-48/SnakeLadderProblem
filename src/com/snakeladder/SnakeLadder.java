package com.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Problem");

		// variable
		int START = 0;
		final int NOPLAY = 0;
		final int LADDER = 1;
		int SNAKE = 2;
		int PLAYER_POSITION = 0;
		int DICE_ROLL_COUNT=0;
		
		

		while (PLAYER_POSITION <= 100) {
			// roll die get a random number
			int dieValue = (int) ((Math.random() * 100) % 6) + 1;
			DICE_ROLL_COUNT++;
			
			// get a player status status in snake and ladder
			int playerStatus = (int) (Math.random() * 100) % 3;

			
			// checking player position
			switch (playerStatus) {
			case NOPLAY:
				PLAYER_POSITION = PLAYER_POSITION;
				break;
			case LADDER:
				PLAYER_POSITION += dieValue;
				break;
			default:
				PLAYER_POSITION -= dieValue;
				break;
			}
			System.out.println("player position is : " + PLAYER_POSITION);

			// player position less than 0
			if (PLAYER_POSITION < 0) {
				PLAYER_POSITION = 0;
				System.out.println("player position is : " + PLAYER_POSITION);
			}

			// player position reaches 100
			if (PLAYER_POSITION > 100) {
				PLAYER_POSITION -=dieValue;
				System.out.println("player reaches previous position :" + PLAYER_POSITION);
	
			}
		
		
			
			//check player position reached to  100
			if(PLAYER_POSITION == 100)
			{
				System.out.println("player reached previous position  :"+PLAYER_POSITION);
				System.out.println("total number of times dice rolled is: "+DICE_ROLL_COUNT);

				break;
			}
		}

	}
}