

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;

        int soma = 0;


        do {
            System.out.println("Número " +(count + 1) +":");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        }while(count < 5);

        System.out.println("O maior número é : " + maior);
        System.out.println("A média entre os números é : " + (soma/5));
    }
}
