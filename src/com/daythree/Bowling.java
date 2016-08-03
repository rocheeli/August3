package com.daythree;

public class Bowling {

	public static void main(String[] args) 
	{
		int startingPins = 10;
		int framesInGame = 10;
		int throwPerFrame = 2;
		int[] finalScore = new int[10];
		
		for (int i = 0; i < framesInGame; i++)
		{
			int throwOne= (int) (Math.random() * ((framesInGame + 1)));
			int pinsLeft = startingPins - throwOne;
			int throwTwo = (int) (Math.random() * ((pinsLeft + 1)));
			
			int frameScore = (throwOne + throwTwo);
			finalScore [i] = frameScore;
			
			
			System.out.println("Your first roll is " + throwOne);
			
			if(throwOne ==10)
			{
				break;
			}
			
			System.out.println("Your second roll is " + throwTwo);
			System.out.println("Frame score = " +(throwOne + throwTwo));
			System.out.println();
		
			
		}
			 System.out.println("This game you scored " + (finalScore[0] + finalScore[1] + finalScore[2] +
					 finalScore[3] + finalScore[4] + finalScore[5] + finalScore[6] + finalScore[7] + 
					 finalScore[8] + finalScore[9]));
	}
	
}
