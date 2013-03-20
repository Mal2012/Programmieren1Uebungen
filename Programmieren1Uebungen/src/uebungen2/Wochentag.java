package uebungen2;

import java.util.Scanner;

public class Wochentag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d;
		int m;
		int y;
		int c;
		int w;
		String result = null;
		String inputYear;

		System.out.println("Tag eingeben: ");
		d = sc.nextByte();
		System.out.println("Monat eingeben: ");
		m = sc.nextByte();
		System.out.println("Jahr eingeben: ");
		inputYear = sc.next();
		c = Integer.parseInt(inputYear.substring(0, 2));
		y = Integer.parseInt(inputYear.substring(2, 4));

		if (m < 3) {
			m = m + 12;

			if (y == 00) {
				y = 99;
				c = c - 1;
			} else {
				y = y - 1;
			}
		}

		w = (d + ((26 * (m + 1)) / 10) + ((5 * y) / 4) + (c / 4) + (5 * c) - 1) % 7;

		switch (w) {
		case 0:
			result = "Sonntag";
			break;
		case 1:
			result = "Montag";
			break;
		case 2:
			result = "Dienstag";
			break;
		case 3:
			result = "Mittwoch";
			break;
		case 4:
			result = "Donnerstag";
			break;
		case 5:
			result = "Freitag";
			break;
		case 6:
			result = "Samstag";
			break;

		}
		System.out.println(result);
	}

}
