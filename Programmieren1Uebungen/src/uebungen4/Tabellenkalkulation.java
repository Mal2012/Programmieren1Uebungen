package uebungen4;
import java.util.Scanner;

public class Tabellenkalkulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Zeilenanzahl angeben:");
		int zeilen = sc.nextInt();
		System.out.println("Bitte Spaltenanzahl angeben:");
		int spalten = sc.nextInt();

		int[][] array = new int[zeilen][spalten];

		for (int i = 0; i < zeilen; i++) {
			for (int ib = 0; ib < spalten; ib++) {
				array[i][ib] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < zeilen; i++) {
			int zeilensumme = 0;
			for (int ib = 0; ib < spalten; ib++) {
				zeilensumme += array[i][ib];
				System.out.print(array[i][ib] + "  ");
			}
			System.out.println("|| " + zeilensumme);
		}

		for(int i =0; i<spalten;i++){
			System.out.print("===");
		}
		System.out.println();
		for(int i =0; i<spalten;i++){
			int spaltensumme=0;
			for (int ib=0;ib<zeilen;ib++){
				spaltensumme += array[ib][i];	
				}
				System.out.print(spaltensumme+" ");
		}
		
	}

}
