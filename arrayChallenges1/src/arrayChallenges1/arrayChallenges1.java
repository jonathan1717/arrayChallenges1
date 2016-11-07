package arrayChallenges1;

import java.util.Scanner;

public class arrayChallenges1
{
		public static void main(String[] args)
			{
					exercise1();
					exercise2();
					exercise3();
					exercise4();
			}
	
		
	
		
		public static void exercise1()
			{
			   String [] myArray = new String[5];
			   
			   	myArray [0]= "Dog";
				myArray [1]= "Cat";
				myArray [2]= "Giraffe";
				myArray [3]= "Elephant";
				myArray [4]= "Human";
				{
						System.out.println(myArray [2]);
				}
			}
			
		public static void exercise2()
			{
				 String [] myArray = new String[5];
				   
				   	myArray [0]= "100";
					myArray [1]= "200";
					myArray [2]= "300";
					myArray [3]= "400";
					myArray [4]= "500";
					{
							System.out.println(myArray [myArray.length-1]);
					}
			}

		public static void exercise3()
			{
				int [] myArray = new int [5];
				   
			   	myArray [0]= 100;
				myArray [1]= 200;
				myArray [2]= 300;
				myArray [3]= 400;
				myArray [4]= 500;
				for (int i=0; i<myArray.length;i++)
				{
					System.out.println(myArray[i]);	
				}
			}

		public static void exercise4()
		{
			double [] myArray = new double [10];
			double average=0;
			double sum = 0;
			
			
			
		   
			myArray [0]= 58;
			myArray [1]= 27;
			myArray [2]= 38;
			myArray [3]= 57;
			myArray [4]= 45;
			myArray [5]= 48;
			myArray [6]= 18;
			myArray [7]= 84;
			myArray [8]= 49;
			myArray [9]= 17;
			
			for (int i=0; i<myArray.length;i++)
				
				{
					
					 sum+= myArray [i];
					 
					
				}
					
			average= sum / myArray.length;	
			
			
			System.out.println("The sum is " + sum);
			System.out.println("The average is " + average);
		}
}
		


