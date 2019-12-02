import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
		int i, A[];
		Scanner in = new Scanner(System.in);
		double B[];
		A = new int[10];
		B = new double[10];
		
		for(i=0; i<A.length; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			A[i] = in.nextInt();
			
			B[i] = A[i];
			B[i] = Math.sqrt(B[i]);
			
			
		}for(i=0; i<A.length; i++) {
			
			System.out.println("O valor "+(i+1)+" em raiz quadrada resultou em: "+B[i]);
			
		}
		in.close();
	}

}
