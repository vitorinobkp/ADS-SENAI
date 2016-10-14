import java.util.Arrays;

public class Vetor04 {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		
		Arrays.fill(num, 8);
		
		for (int valor: num){
			System.out.println(valor);
		}
		
		
		
//		int vet[] = {3, 7, 6, 1, 9, 4, 2};
//		for(int v:vet){
//			System.out.print(v + " ");
//			int p = Arrays.binarySearch(vet, v);
//			
//			System.out.println("Encontrei o valor na posição " + p);
//
//		}
//		System.out.println("");
//		int p = Arrays.binarySearch(vet, 1);
//		
//		System.out.println("Encontrei o valor na posição " + p);
	}

}
