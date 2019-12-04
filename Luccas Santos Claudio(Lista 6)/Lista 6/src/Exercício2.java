import java.util.Scanner;
public class Exercício2 {

    public static void main(String[] args) {
        int TotalRestoPrimos[], b=0, i, A[];
        A = new int[10];
        TotalRestoPrimos = new int[10];

        Scanner in = new Scanner(System.in);


        for(i=0; i<A.length; i++) {
            System.out.println("Digite o "+(i+1)+"º valor");
            A[i] = in.nextInt();
            TotalRestoPrimos[i] = 0;

            for(int c=1;c<=A[i];c++){

                if(A[i]%c==0){
                    TotalRestoPrimos[i]++;
                }

            }
        }


        for (i=0;i<A.length;i++) {
            if (TotalRestoPrimos[i] == 2) {
                b++;
            }
        }


        System.out.println("O número de valores primos encontrados foi: "+b);
        in.close();
    }

}
