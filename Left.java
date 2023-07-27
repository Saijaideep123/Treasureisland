package com.mono.ifelse;

import java.util.Scanner;

public class Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to Treasure island \n your mission is to find the treasure");
        Scanner sc=new Scanner(System.in);
        System.out.println("left or right");
        String n=sc.next();

		if (n.equals("left"))
        {
        	System.out.println("swim or wait?");
        	String n1=sc.next();
        	n1=n1.toLowerCase();
        	if(n1.equals("wait"))
        		{
        		System.out.println("which door (red/yellow/blue)");
        		String n2=sc.next();
        		n2=n2.toLowerCase();
        		if(n2.equals("red"))
        		{
        			System.out.println("\n Burned by fire\n Game over");
        		}
        		else if(n2.equals("yellow"))
        		{
        			System.out.println("you Win");
        		}
        		else if(n2.equals("blue"))
        		{
        			System.out.println("\n Eaten by beasts \n Game over");
        		}
        		else {
        			System.out.println("Game over");
        		}
        		
        		}
        	else {
        		System.out.println("Attacked by trout\n Game over");
        	}
        }
		else {
			System.out.println("Fall into a hole \n Game Over");
		}
		
	
			}

}
