package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How much $ do you want to start with? ");
		int startAmount = in.nextInt();

		System.out.print("What is the win chance? ");
		double winChance = in.nextDouble();

		System.out.print("What is the win limit? ");
		int winLimit = in.nextInt();
		int numRuins = 0;
		int totalSimulations;
		for(totalSimulations=0; totalSimulations<500; totalSimulations++) {	
			int money = startAmount;
			int numDay = 0;

			System.out.println("Day " + (totalSimulations+1));
			while (money > 0 && money < winLimit) {

				if (Math.random() <= winChance) {
					money ++;
				}
				else {
					money --;
				}
				numDay++;
			}
			System.out.println("Number of plays: " + numDay);
			if(money==0) {
				System.out.println("ruin");
				numRuins++;
			}
			else {
				System.out.println("success");
			}
			System.out.println();
		}
		System.out.println("Ruin Rate: "+((double)numRuins/totalSimulations*100)+"%");
		if(winChance==0.5) {
			System.out.println("Expected Ruin Rate: "+ (1-(double)startAmount/winLimit));
		}
		else {
			double a = (1-winChance)/winChance;
			System.out.println((Math.pow(a,  startAmount) - Math.pow(a,winLimit))/(1-Math.pow(a,winLimit)));
		}

	}
}
