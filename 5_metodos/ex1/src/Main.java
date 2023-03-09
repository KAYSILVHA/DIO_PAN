import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //calculadora
//        System.out.println("______SOMANDO DOIS NÚMEROS______");
//
//        System.out.println("Digite um valor:");
//        Double num1 = leitor.nextDouble();
//        System.out.println("Digite outro valor");
//        Double num2 = leitor.nextDouble();
//
//        Calculadora.soma(num1,num2);



        // mensagem
//        System.out.println("Diga o horário: ");
//        Double horario = leitor.nextDouble();
//        Mensagem.hora(horario);


        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


    }
}