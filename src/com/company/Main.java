package com.company;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		String add = "+";
		String times = "x";
		String take = "-";
		String div = "/";
		long erg;

		System.out.println("Erste Zahl eingeben: ");
		Scanner zahl1 = new Scanner(System.in);
		int z1 = zahl1.nextInt();
		System.out.println("Zweite Zahl eingeben: ");
		Scanner zahl2 = new Scanner(System.in);
		int z2 = zahl2.nextInt();
		System.out.println("Welche Operation soll durchgeführt werden? +, -, x und /");
		Scanner operand = new Scanner(System.in);
		String o = operand.nextLine();

		if (o.equals(add)) {
			erg = z1 + z2;
			System.out.println(z1 + " + " + z2 + " = " + erg);
		} else if (o.equals(times)) {
			erg = z1 * z2;
			System.out.println(z1 + " x " + z2 + " = " + erg);
		} else if (o.equals(take)) {
			erg = z1 - z2;
			System.out.println(z1 + " - " + z2 + " = " + erg);
		} else if (o.equals(div)) {
			erg = z1 / z2;
			System.out.println(z1 + " / " + z2 + " = " + erg);
		}
	}
}