import java.util.Scanner;

public class switchNumber {
    public static void main(String[] args) {
        Scanner digiteNumber= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroDigitado= digiteNumber.nextInt();


        switch (numeroDigitado){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor Indefinido");
        }
    }
}
