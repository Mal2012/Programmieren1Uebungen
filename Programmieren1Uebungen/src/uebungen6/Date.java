package uebungen6;
public class Date {
	int day;
	int month;
	int year;

 Date(int m, int d, int y) {
	 	
		month = ((m >= 0 && m < 12) ? m : 0);
		day = ((d >= 0 && d < 31) ? d : 0);
		year = ((y >= -2000 && y < 3000) ? y : 0);

	}
 
 Date(int m, int y) {
		month = ((m >= 0 && m < 12) ? m : 0);
		day = 1;
		year = ((y >= -2000 && y < 3000) ? y : 0);

	}
 
 Date(String  m, int d, int y) {
		switch(m){
		case "Januar": month = 1; break;
		case "Febuar": month = 2; break;
		case "März": month = 3; break;
		case "April": month = 4; break;
		case "Mai": month = 5; break;
		case "Juni": month = 6; break;
		case "Juli": month = 7; break;
		case "August": month = 8; break;
		case "September": month = 9; break;
		case "Oktober": month = 10; break;
		case "November": month = 11; break;
		case "Dezember": month = 12; break;
		default: month = 1; break;
		
		}
		day = ((d >= 0 && d < 31) ? d : 0);
		year = ((y >= -2000 && y < 3000) ? y : 0);

	}
int m(){
	return month;
}

int d(){
	return day;
}
int y(){
	return year;
}
	
public String toString(){
	return "Month: "+m()+" Day: "+d()+" Year: "+y();
	
}

}
