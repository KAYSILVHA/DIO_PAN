import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> temperatura = new ArrayList<>();
        temperatura.add(32d);
        temperatura.add(29d);
        temperatura.add(30d);
        temperatura.add(35d);
        temperatura.add(27d);
        temperatura.add(28.9);
        System.out.println(temperatura);

        System.out.println("----------------------");
        System.out.println("A média dos valores é: ");
        double soma = 0.0;
        Iterator<Double> iterator = temperatura.iterator();
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        Double media = soma / temperatura.size();
        System.out.println(media);

        System.out.println("----------------------");

        for (Double temperaturas : temperatura) {

            if (temperaturas > media) System.out.println(" A temperatura " + temperaturas + " ocorreu no mês " + new Integer(temperatura.indexOf(temperaturas) + 1));
        }
    }}


