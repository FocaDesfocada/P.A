import java.util.Scanner;
public class Exerc�cio3 {

	public static void main(String[] args) {
		int A[], B[], i;
		Scanner in = new Scanner (System.in);
		A = new int [10];
		B = new int [10];
		
		
		for(i=0; i<A.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"� valor");
			A[i] = in.nextInt();
			
			
		
		}
		
		for(i=0; i<A.length; i++) {
			
			B[0] = A[9];
			B[1] = A[8];
			B[2] = A[7];
			B[3] = A[6];
			B[4] = A[5];
			B[5] = A[4];
			B[6] = A[3];
			B[7] = A[2];
			B[8] = A[1];
			B[9] = A[0];
			
			System.out.println("Os valores de forma reversa s�o: "+B[i]);
		}
		in.close();	
	}

}
