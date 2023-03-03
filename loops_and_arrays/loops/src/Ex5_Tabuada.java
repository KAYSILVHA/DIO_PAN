

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número de 1 a 10 para ver sua tabuada: ");
        int numeroTabuada = scan.nextInt();

        System.out.println("Tabuada do " + numeroTabuada);

//        for (int i = 1; i <= 10; i++){
//            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
//        }
        int i = 1;
//        while (numeroTabuada<=10){
//
//            i++;
//            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
////
//              if (i==10) break;
//        }
            do {
                i++;
                System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
                if (i==10) break;

            }while(numeroTabuada<=10);



    }
}
