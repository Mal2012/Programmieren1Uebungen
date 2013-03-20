package uebungen3;

import java.util.Scanner;
public class Vokale {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b=true;

		do{
		System.out.println("\nBitte Satz eigeben:");
		String satz =sc.nextLine();
		char c;
		int laenge = satz.length();
		int a=0, e=0, is=0, o=0, u=0, sonst=0;
		for(int i=0; i<laenge; i++){
			c = Character.toLowerCase(satz.charAt(i));
			switch(c){
			case 'a': a++; break;
			case 'e': e++; break;
			case 'i': is++; break;
			case 'o': o++; break;
			case 'u': u++; break;
			default: sonst++;
			}
			
		}
		System.out.println("a:"+a+"\ne:"+e+"\ni:"+is+"\no:"+o+"\nu:"+u+"\nSonstige:"+sonst);
		System.out.println("\nBeenden? (j oder n)");
		Scanner sc2 = new Scanner(System.in);
		switch(sc2.next().charAt(0)){
		case 'n':b=true;break;
		case 'j':b=false;break;
		default:b=true;
		}
			
		}
		while(b==true);

	}
}
