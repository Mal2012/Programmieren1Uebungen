package vorlesung;

public class Student {

	private String name;
	private int matNummer;
	private int gebDatum;
	static String hochschule = "FH Coburg";
	
	
	public Student(String name, int matNummer, int gebDatum){
		this.name = name;
		this.matNummer = matNummer;
		this.gebDatum = gebDatum;
		
	}
	
	public Student(){
		
	}
	
	public void setGebDatum(int gebDatum) {
		this.gebDatum = gebDatum;
	}
	public void setMatNummer(int matNummer) {
		this.matNummer = matNummer;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getmatNummer(){
		return this.matNummer;
	}
	
	public int getgebDatum(){
		return gebDatum;
	}
	
	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
		return "Name: "+ name +" Mat.Nummer: "+ matNummer +" Geburtsjahr: "+ gebDatum + " Hochschule: " + hochschule;
	
	}
	
	public String getalter(int jahr){
		return "Alter: "+ (jahr - gebDatum);
	}
	
	

}
