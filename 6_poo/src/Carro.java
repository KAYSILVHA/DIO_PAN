public class Carro {

    String color;
    String modelo;
    Integer capacidadeTanque;


    Carro(){

    }
    Carro(String color, String modelo, int capacidadeTanque){
        this.color = color;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
