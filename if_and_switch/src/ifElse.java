import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner digiteNumero = new Scanner(System.in);
        System.out.println("Digite o número do mês: ");
        int numeroMes = digiteNumero.nextInt();

        if (numeroMes==1){
            System.out.println("Janeiro");
        } else if (numeroMes==2) {
            System.out.println("Fevereiro");

        }else if (numeroMes==3) {
            System.out.println("Março");

        }else if (numeroMes==4) {
            System.out.println("Abril");

        }else if (numeroMes==5) {
            System.out.println("Maio");

        }else if (numeroMes==6) {
            System.out.println("Junho");

        }else if (numeroMes==7) {
            System.out.println("Julho");

        }else if (numeroMes==8) {
            System.out.println("Agosto");

        }else if (numeroMes==9) {
            System.out.println("Setembro");

        }else if (numeroMes==10) {
            System.out.println("Outubro");

        }else if (numeroMes==11) {
            System.out.println("Novembro");

        }else if (numeroMes==12) {
            System.out.println("Dezembro");

        }
        if(numeroMes==1 || numeroMes==7 || numeroMes==12){
            System.out.println("Mês de Férias!");
        }
    }

}