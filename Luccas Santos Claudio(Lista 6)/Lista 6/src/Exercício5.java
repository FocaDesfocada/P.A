import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
	
		final int  Const=10;
	
		int  aux,i=0,j=0, A[], B[], C[];
	
		A=new int [Const];
		B=new int [Const];
		C=new int [Const];
	
		for (i=0;i<Const;i++) {
			System.out.println("Digite o "+(i+1)+"º número");
			A[i] = in.nextInt();
			B[i] = A[i];
			C[i] = A[i];
		}
		
			for(i=0;i<Const;i++){
			
				for(j=0;j<Const-1;j++){
				
					if(B[i]>B[j]){
						aux = B[i];
						B[i] = B[j];
						B[j] = aux;
			
				}	
				
			}
		
		}
			
			for(i=0;i<Const;i++){
				
			for(j=0;j<Const-1;j++){
				
				if(C[i]<C[j]){
					 aux = C[i];
					C[i] = C[j];
					C[j] = aux;
			
				}	
				
			}
		
		}
			
		for(i=0;i<Const; i++) {
			System.out.print(A[i]+"\n ");
		
		}
			System.out.println("\nordem decrescente: ");
		
		for(i=0;i<Const; i++) {
			System.out.print(B[i]+"  ");
		
		}
			System.out.println("\nordem crescente: ");
		
		for(i=0;i<Const; i++) {
			System.out.print(C[i]+" ");
			
		}
		in.close();
	}
}