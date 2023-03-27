import javax.swing.event.TreeModelListener;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivos populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("-----------------------------------");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("-----------------------------------");
        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");

        System.out.println("Tem PB na lista: " + populacaoEstadosNE.containsKey("PB"));


        System.out.println("Adicionar PB: " + populacaoEstadosNE.put("PB", 4039277));
        System.out.println(populacaoEstadosNE);


        System.out.println("-----------------------------------");
        System.out.println("Exiba a população do estado PE: " + populacaoEstadosNE.get("PE"));


        System.out.println("-----------------------------------");
        System.out.println("Exiba na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE2);

        System.out.println("-----------------------------------");
        System.out.println("Exiba na ordem em alfabetica: ");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        System.out.println(populacaoEstadosNE3);

        System.out.println("-----------------------------------");


        System.out.println("Exiba o estado com a menor população e sua quantidade: ");
        Integer menorPopuNum = Collections.min(populacaoEstadosNE.values());
        String menorPopuNome = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(menorPopuNum)) {
                menorPopuNome = entry.getKey();
                System.out.println("Estado com a menor população: " + menorPopuNome + " - " + menorPopuNum);
            }


        }

        System.out.println("-----------------------------------");
        System.out.println("Exiba o estado com a maior população e sua quantidade: ");
        Integer maiorPopuNum = Collections.max(populacaoEstadosNE.values());
        String maiorPopuNome = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(maiorPopuNum)) {
                maiorPopuNome = entry.getKey();
                System.out.println("Estado com a maior população: " + maiorPopuNome + " - " + maiorPopuNum);
            }


        }
        System.out.println("-----------------------------------");
        int soma = 0;

        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
            while(iterator.hasNext()) {
                soma += iterator.next();

            }
        System.out.println(soma);

        System.out.println("-----------------------------------");
        System.out.println("Exiba a média: " + soma/populacaoEstadosNE.size());

        System.out.println("-----------------------------------");
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);


        System.out.println("-----------------------------------");
        System.out.println("Apague o dicionário de estados: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("-----------------------------------");
        System.out.println("A lista está vazia?: " + populacaoEstadosNE.isEmpty());



        }


    }