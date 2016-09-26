package Problem1;

import java.util.Scanner;
import static java.lang.Math.pow;

public class TuitionCost {
	public static void main(String[] args) {
		double TotalTuition=0;
		Scanner input = new Scanner(System.in);

		System.out.println("What is the inital tuiton rate for 2014-2015");
		double InitialTuition = input.nextFloat();

		System.out.println("What is the percentage increase each year");
		float Percentage = input.nextFloat();

		for (int i = 0; i < 4; i++) {
			double sum = 0;
			
			sum = InitialTuition * Math.pow((Percentage / 100), 4) + InitialTuition;
			InitialTuition = InitialTuition * (Percentage / 100) + InitialTuition;
			TotalTuition=TotalTuition+sum;
			System.out.printf("The toal cost for this year is $%.2f%n",TotalTuition);
			input.close();
			
		}

	}
}
