package uebungen5;

public class CharacterUtil {

	public static void main(String[] args) {
		   char[] s = { 'S', 'O', 'R', 'T', 'B' , 'Y'}; 
		      char[] t = { 'B', 'U', 'B', 'B', 'L' ,'E'}; 
		 
		if(CharacterUtil.vertausche(s,t));
		for(int i=0; i<s.length;i++){
			System.out.print(s[i]);
			//System.out.print(t[i]);
		}
	
	}
	
	public static boolean vertausche(char[] s, char[] t){
		if(s.length==t.length){
			for(int i=0; i<s.length; i++){
			char st = s[i];
			char ts = t[i];
			s[i]=ts;
			t[i]=st;
			}
			return true;
		}else{
			return false;
		}
	}

}
