
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantPares = 0, quantImpar = 0;

        int quantNumeros;
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Digite o número " + (count + 1) +": ");
            numero = scan.nextInt();
            count++;
            if (numero % 2 == 0) quantPares++;
            else quantImpar++;

        }while(count < quantNumeros);
        System.out.println("Existem " + quantPares + " números pares");
        System.out.println("Existem " + quantImpar + " números impares");
    }
}
