package primeiro;

public class terceira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 2, c = 0;
		
		if((a == b) && (a==c) && (b==c)){
			System.out.println("Equilatero");
		} else {
			if((a!=b) || (a!=c) || (b!=c)){
				System.out.println("Isoceles");
			} else {
				System.out.println("Escaleno");
			}
		}
	}
}