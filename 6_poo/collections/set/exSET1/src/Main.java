import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        cores.add("violeta");
        cores.add("anil");
        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("laranja");
        cores.add("vermelho");
        System.out.println(cores);


        System.out.println("--------------------------");

        System.out.println("Cores do Arco-Íris");
        for (String cor: cores) {
            System.out.println(cor);

        }


        System.out.println("--------------------------");

        System.out.println("A quantidade de cores é : " + cores.size() );



        System.out.println("--------------------------");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);



        System.out.println("--------------------------");

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);



        System.out.println("--------------------------");

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }



        System.out.println("--------------------------");

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores);



        System.out.println("--------------------------");

        System.out.println("Limpe o conjunto: ");
        cores.clear();


        System.out.println("--------------------------");

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());




    }
}