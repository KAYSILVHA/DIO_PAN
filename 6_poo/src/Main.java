public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

            carro1.setColor("Azul");
            carro1.setModelo("Mercedes");
            carro1.setCapacidadeTanque(59);


            System.out.println(carro1.getModelo());
            System.out.println(carro1.getColor());
            System.out.println(carro1.getCapacidadeTanque());
            System.out.println(carro1.totalValorTanque(6.39));


        Carro carro2 = new Carro("verde", "mercedez", 60);

            System.out.println(carro2.getModelo());
            System.out.println(carro2.getColor());
            System.out.println(carro2.getCapacidadeTanque());
            System.out.println(carro2.totalValorTanque(6.41));

        }

        }

