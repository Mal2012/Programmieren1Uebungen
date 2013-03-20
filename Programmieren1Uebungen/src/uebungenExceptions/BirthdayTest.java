package uebungenExceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BirthdayTest {

	public static void main(String[] args) {
		while (true) {
			try {
				BufferedReader input = new BufferedReader(
						new InputStreamReader(System.in));
				String strInput = input.readLine();

				try {
					Birthday bd = new Birthday(strInput);
					System.out.println(bd.theDay);
				} catch (InvalidBirthdayException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					System.exit(1);
				}
			} catch (Exception e) {
				e.fillInStackTrace();
			}
		}
	}
}
