import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
		int a=2, b=0, i, A[];
		A = new int[10];
		Scanner in = new Scanner(System.in);
		
		
		for(i=0; i<A.length; i++) {
			System.out.println("Digite o "+(i+1)+"� valor");
			A[i] = in.nextInt();
			
			if(A[i] % a == 0 && a < A[i]) {
				
				System.out.println("O n�mero n�o � primo");
				
			}else {
				
				System.out.println("O n�mero � primo");
				b++;
			}
			
		}
		
		System.out.println("O n�mero de valores primos encontrados foi: "+b);
		in.close();
	}

}
