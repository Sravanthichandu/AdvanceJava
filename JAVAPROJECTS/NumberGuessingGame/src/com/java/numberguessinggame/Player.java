package com.java.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class Player  {
	int count=0;
	int  target_input;
	public void computer()
	{
		Random r = new Random();
		target_input = r.nextInt(10);
		playerInput();
		
	}
	public void playerInput()
	{
		int player_input;
		Scanner s = new Scanner(System.in);
		while(true)
		{

			System.out.println("Enter a number : ");
			player_input = s.nextInt();
			count++;

			if(player_input>target_input)
			{
				System.out.println("Your guess is greater than computer target ");
				playerInput();
			}
			else if(player_input<target_input)
			{
				System.out.println("Your guess is Less than computer target ");
				playerInput();
			}
			else if(player_input==target_input)
			{
				System.out.println("Your guess Correct !.. Congratulations ");
				System.out.println("Number of attempts took to guess the number correctly : " + count );
				userInput();
			}
			break;
		}
		
	}
	public void userInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to Play Again ?(Yes,No) ");
		String input = s.next();
	    playagain(input);
	}
	public void playagain( String input)
	{	
            if(input.equalsIgnoreCase("Yes"))
			{
		    	
	 	    	   System.out.println("Welcome Back ..Start Your Number Guessing Game ");
				   playerInput();
				   userInput();

			}
			else if( input.equalsIgnoreCase("No"))
	 	    {
	 	    		  System.out.println("Thank You ...");	
	 	    		  Bye();
	 	    		  
	 	    	
		    }
			else
			{
				System.out.println("Invalid Input");
				playerInput();
				userInput();

	
			}
			
	}
	public void Bye()
	{
		System.out.println("Play Again...");
	}
	
	
	public static void main(String[] args) {
		
		Player p = new Player();
		System.out.println("Welcome to Number Guessing Game");
		p.computer();
	}
}
