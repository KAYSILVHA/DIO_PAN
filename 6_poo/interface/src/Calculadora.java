public class Calculadora implements OperacaoMatematica{


    @Override
    public void soma(double operando1, double operando2){
        System.out.println("SOMA= " + operando1+operando2);
    }
    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("SUBTRAÇÃO= " + (operando1-operando2));
    }
    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("MULTIPLICAÇÃO= " + (operando1*operando2));
    }
    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("DIVISÃO= " + (operando1/operando2));
    }


}
