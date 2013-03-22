package vorlesung;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Katja", 346, 1994);
		Student s1 = new Student();
		System.out.println(s.getgebDatum());
		System.out.println(s.getName());
		System.out.println(s.getmatNummer());
		
		
		System.out.println(s1);
		
		System.out.println(s.getalter(2012));
		
	}

}
