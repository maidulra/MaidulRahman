package myfirst;

import java.util.Scanner;
import java.util.Random;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					double x;
					Scanner input = new Scanner(System.in);
					System.out.println("Guess a number");
					
					Random b = new Random();
					int y= b.nextInt(10);
					for(int a = 0; a<=2;a++){
						x=input.nextDouble();
						
						if (y==x){
							System.out.println("Right Number was "+y);
						}else{
							System.out.println("Wrong");
						}
					}
					System.out.println("Wrong Number was "+y);		
				}


		
		
		
		
	}

