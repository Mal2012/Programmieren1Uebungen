package uebungenExceptions;
import java.text.DateFormat;
import java.text.ParseException;

class Birthday {
	String theDay;

	public Birthday(String s) throws InvalidBirthdayException {
		checkDay(s);
		this.theDay = s;
	}

	public void checkDay(String s) throws InvalidBirthdayException {

		DateFormat df = DateFormat.getDateInstance();

		df.setLenient(false);

		try {
			df.parse(s);
		} catch (ParseException e) {
			throw new InvalidBirthdayException("Ungültiges Datum");
		}

	}
}
