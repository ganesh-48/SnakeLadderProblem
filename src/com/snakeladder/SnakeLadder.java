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

		// sarting position of player
		System.out.println("starting position of player is  " + START);

		while (PLAYER_POSITION <= 100) {
			// roll die get a random number
			int dieValue = (int) ((Math.random() * 100) % 6) + 1;
			System.out.println("player roll die get random number is : " + dieValue);

			// get a player status status in snake and ladder
			int playerStatus = (int) (Math.random() * 100) % 3;

			// print player status
			if (playerStatus == NOPLAY) {
				System.out.println("player is in No Play status ");
			}
			if (playerStatus == LADDER) {
				System.out.println("player is in ladder status ");
			}
			if (playerStatus == SNAKE) {
				System.out.println("player is in snake status ");
			}

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
				System.out.println("player position is " + PLAYER_POSITION);
			}

			// player position reaches 100
			if (PLAYER_POSITION == 100) {
				System.out.println("player reaches winning position " + PLAYER_POSITION);
				break;
			}
		}

	}
}