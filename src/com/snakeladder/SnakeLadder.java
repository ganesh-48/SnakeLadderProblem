package com.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Problem");
		
		final int START=0;

		System.out.println("starting position of player is  " + START);
	
		int dieValue=(int) (Math.random()  % 6)+1;
		System.out.println("player roll die get random number is : "+dieValue);
	}
}
