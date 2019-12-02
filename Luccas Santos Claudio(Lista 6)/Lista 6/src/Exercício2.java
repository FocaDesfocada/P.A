import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
		int a=2, b=0, i, A[];
		A = new int[10];
		Scanner in = new Scanner(System.in);
		
		
		for(i=0; i<A.length; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			A[i] = in.nextInt();
			
			if(A[i] % a == 0 && a < A[i]) {
				
				System.out.println("O número não é primo");
				
			}else {
				
				System.out.println("O número é primo");
				b++;
			}
			
		}
		
		System.out.println("O número de valores primos encontrados foi: "+b);
		in.close();
	}

}
