package Basic;

import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mynumber=(int)(Math.random()*100);
		int usernumber=0;
		do {
			System.out.println("guess my number(1-100):");
			usernumber=sc.nextInt();
			if(usernumber==mynumber)
			{
				System.out.println("Congratulations !Wow...! That's great you guess the correct number.");
				break;
			}
			else if(usernumber>mynumber)
			{
				System.out.println(usernumber+" number is greater  to my number please choose smaller one!");
			}
			else
			{
				System.out.println(usernumber+" number is smaller to my number please choose greater one!");
			}
		}while(usernumber>=0);
		
		System.out.println("my number is "+mynumber);
	}
	
}
