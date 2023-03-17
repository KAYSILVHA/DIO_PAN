public class Main {
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario();
//upcasts

       Funcionario gerente = new Gerente();
       Funcionario vendedor = new Vendedor();
       Funcionario faxineiro = new Faxineiro();
//downcasts

        //Gerente gerente_ new Funcionario(); IMPLEMENTACAO ERRADA
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //DA ERRO NA EXECUCAO, POR ISSO EVITAR O DOWNCAST
    }
}