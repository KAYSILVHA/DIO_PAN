import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class Main {
    public static void main(String[] args) {
        int quantLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < quantLancamentos; i++) {
            int number = geradorDeLancamento.nextInt(6) + 1;
            valores.add(number);

        }

            Map<Integer, Integer> lancamentos = new HashMap<>();
            for (Integer resultado : valores) {
                if (lancamentos.containsKey(resultado))
                    lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
                else lancamentos.put(resultado, 1);
            }
        System.out.print("Jogando");

        System.out.println(valores);
        System.out.println(lancamentos);



    }
}