public class Main {

public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Area.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Area.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Area.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}

