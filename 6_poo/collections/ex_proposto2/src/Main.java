import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sobre o crime responda [S] ou [N]");
        System.out.println("---------------------");
        System.out.println("Telefonou para a vítima? ");
        String res1 = scanner.next();
        System.out.println("Esteve no local do crime? ");
        String res2 = scanner.next();
        System.out.println("Mora perto da Vítima? ");
        String res3 = scanner.next();
        System.out.println("Devia para a Vítima? ");
        String res4 = scanner.next();
        System.out.println("Já trabalhou com a vítima? ");
        String res5 = scanner.next();

        List<String> respostas = new ArrayList<>();
        respostas.add(res1);
        respostas.add(res2);
        respostas.add(res3);
        respostas.add(res4);
        respostas.add(res5);
        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("S")){
                count ++;
            }
        }
        switch (count){
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">>CÚMPLICE<");
                break;
            case 5:
                System.out.println(">>ASSASSINA<<");
                break;
            default:
                System.out.println(">>INOCENTE<<");
                break;
        }

    }
}