import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println("A posição da nota 5.0 é: " + notas.indexOf(5.0));
        System.out.println("----------------------");
        System.out.println("Adicioando 8 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("Substituindo 5 por seis: ");
        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("Verificando se o 5 está na lista: " + notas.contains(5.0));


        System.out.println("----------------------");
        System.out.println("Imprimimdo a lista: ");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("----------------------");
        System.out.println("A terceira nota adicionada é: " + notas.get(2));

        System.out.println("----------------------");
        System.out.println("A menor nota é: " + Collections.min(notas));

        System.out.println("----------------------");
        System.out.println("A maior nota é: " + Collections.max(notas));

        System.out.println("----------------------");
        System.out.println("A soma dos valores é: ");
        double soma = 0.0;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("----------------------");
        System.out.println("A média é: " + (soma/notas.size()));

        System.out.println("----------------------");
        System.out.println("Removendo a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("Remova a nota na posição0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("A soma dos valores é: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("Apagando a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("----------------------");
        System.out.println("A lista está vazia? : " + notas.isEmpty());


    }
}