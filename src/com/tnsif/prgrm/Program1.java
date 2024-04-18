package com.tnsif.prgrm;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	{
	System.out.println("Enter your name");

    int a=scan.nextInt();
    
    if(a%2==0)
    {
    	System.out.println("is an even number");

    }
   
    else
    { 
    	System.out.println("is an odd number");
    }
    
	}
}
}