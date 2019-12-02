import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
		int i, maior=2, menor, A[] = new int[10];
		Scanner in = new Scanner(System.in);
		
		
		for(i=0;i< A.length;i++) {
			
			System.out.println("Digite o "+(i+1)+"º número");
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
		System.out.println("O maior número identificado é: "+maior);

		System.out.println("O menor número identificado é: "+menor);
		
		in.close();
	}

}
