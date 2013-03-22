package vorlesung;
public class Rekursion {

public static int f(int x, int y) {

if (x < 1){
return 1;

}else if (y <= 2){
return 2;

}else{

return 3 * f(x + 1, y - 1) - f(x - 2, y / 2);
}
}

public static void main(String[] args){
	System.out.println(f(3,5));
}
}