import java.util.Scanner;
public class Exerc�cio4 {

	public static void main(String[] args) {
		int i, maior=2, menor, A[] = new int[10];
		Scanner in = new Scanner(System.in);
		
		
		for(i=0;i< A.length;i++) {
			
			System.out.println("Digite o "+(i+1)+"� n�mero");
			A[i] = in.nextInt();
			if(i==0){
				maior = A[0];
			}
			if(A[i]>maior) {
				maior = A[i];
				
				
			}
			
		}
		menor = maior;
		
		for(i=0;i<A.length;i++) {
			
			if(menor>A[i]) {
				
				menor = A[i];
				
			}
			
		}
		System.out.println("O maior n�mero identificado �: "+maior);

		System.out.println("O menor n�mero identificado �: "+menor);
		
		in.close();
	}

}
