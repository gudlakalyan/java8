package java2;

import java.util.Scanner;

public class TenentClas {
	public static void main(String[] args) {
		System.out.println("Welcome to Goldy Appartments");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your service");
		String s = sc.next();
		if (s.equalsIgnoreCase("Gold")) {
			GoldService gd = new GoldService();
			System.out.println("Your subscription cost is :");
			System.out.print(gd.getLift() + gd.getSecurity());

		}
	}
}
