import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		
		int num[] = {3,5,1,8,4};
		Arrays.sort(num);

		for(int valor: num){
			System.out.print(valor + ", ");
		}
		
		System.out.println();
		
		double v[] = {3.5, 2.75, 9, -4.5};
		Arrays.sort(num);
		for(double valor: v){
			System.out.print(valor + ", ");
		}
	}

}
