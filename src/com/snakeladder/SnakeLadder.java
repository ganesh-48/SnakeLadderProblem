package com.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Problem");

		// variable
		final int NOPLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int PLAYER1_POSITION = 0;
		int PLAYER2_POSITION = 0;
		int DICE_ROLL_COUNT=0;
		int DICE_ROLL_COUNT2=0;
		
		//while loop for 1st player 2nd  player reach winning position
		while (PLAYER1_POSITION <= 100 && PLAYER2_POSITION <= 100) {
			// roll die get a random number
			int dieValue = (int) ((Math.random() * 100) % 6) + 1;
			DICE_ROLL_COUNT++;
			
			// get a player status status in snake and ladder
			int player1Status = (int) (Math.random() * 100) % 3;

			
			// checking player status if NOPLAYS
			switch (player1Status) {
			case NOPLAY:
				PLAYER1_POSITION += 0;
				break;
			case LADDER:
				//if 1nt player gets LADDER status will get one more chance to roll a dice
				PLAYER1_POSITION += dieValue;
				if(PLAYER1_POSITION > 100)
				{
					PLAYER1_POSITION -=dieValue;
				}
				//while loop till 1st player status is NO_PLAY or SNAKE
				while(player1Status == 1)
				{
					player1Status=(int) (Math.random() *100)%3;
					if(player1Status == 1)
					{
						dieValue=(int) ((Math.random() *100)%6)+1;
						PLAYER1_POSITION +=dieValue;
						DICE_ROLL_COUNT++;
						if(PLAYER1_POSITION > 100)
						{
							PLAYER1_POSITION -=dieValue;
						}
						if(PLAYER1_POSITION ==100)
						{
							break;
						}
					}
					if(player1Status == 2)
					{
						dieValue=(int) ((Math.random() *100)%6)+1;
						PLAYER1_POSITION -=dieValue;
						DICE_ROLL_COUNT++;
						break;
					}
				}

				break;				
			default:
				PLAYER1_POSITION -= dieValue;
				break;
			}
			System.out.println("1st player position is : " + PLAYER1_POSITION);

			//1st player position less than 0
			if (PLAYER1_POSITION < 0) {
				PLAYER1_POSITION = 0;
				System.out.println("1st player position is : " + PLAYER1_POSITION);
			}

			//1st player position reaches 100
			if (PLAYER1_POSITION > 100) {
				PLAYER1_POSITION -=dieValue;
				System.out.println("player reaches previous position :" + PLAYER1_POSITION);
	
			}
		
		
			
			//check 1st player position reached to  100
			if(PLAYER1_POSITION == 100)
			{
				System.out.println("1st player reached previous position  :"+PLAYER1_POSITION);
				System.out.println("total number of times dice rolled by 1st player is: "+DICE_ROLL_COUNT);

				break;
			}
			
			
			//for 2nd player
			//2nd die Value
			int die2Value = (int) ((Math.random() * 100) % 6) + 1;
			DICE_ROLL_COUNT2++;
			
			// get a 2nd player status status in snake and ladder
			int player2Status = (int) (Math.random() * 100) % 3;

			
			// checking 2nd  player status
			switch (player2Status) {
			case NOPLAY:
				PLAYER2_POSITION += 0;
				break;
			case LADDER:
				//if 2nd player gets LADDER status will get one more chance to roll a dice
				PLAYER2_POSITION += die2Value;
				if(PLAYER2_POSITION > 100)
				{
					PLAYER2_POSITION -=die2Value;
				}
				//while loop till 2nt player status is NO_PLAY or SNAKE
				while(player2Status == 1)
				{
					player2Status=(int) (Math.random() *100)%3;
					if(player2Status == 1)
					{
						die2Value=(int) ((Math.random() *100)%6)+1;
						PLAYER2_POSITION +=die2Value;
						DICE_ROLL_COUNT2++;
						if(PLAYER2_POSITION > 100)
						{
							PLAYER2_POSITION -=die2Value;
						}
						if(PLAYER2_POSITION ==100)
						{
							break;
						}
					}
					if(player2Status == 2)
					{
						die2Value=(int) ((Math.random() *100)%6)+1;
						PLAYER2_POSITION -=die2Value;
						DICE_ROLL_COUNT2++;
						break;
					}
				}

				break;				
			default:
				PLAYER2_POSITION -= die2Value;
				break;
			}
			System.out.println("2nd player position is : " + PLAYER2_POSITION);

			// player position less than 0
			if (PLAYER2_POSITION < 0) {
				PLAYER2_POSITION = 0;
				System.out.println("2nd player position is : " + PLAYER2_POSITION);
			}

			// player position reaches 100
			if (PLAYER2_POSITION > 100) {
				PLAYER2_POSITION -=die2Value;
				System.out.println("2nd player reaches previous position :" + PLAYER2_POSITION);
	
			}
		
		
			
			//check player position reached to  100
			if(PLAYER2_POSITION == 100)
			{
				System.out.println("player reached previous position  :"+PLAYER2_POSITION);
				System.out.println("total number of times dice rolled by 2nd plaayer is: "+DICE_ROLL_COUNT);

				break;
			}
		}

	}


}