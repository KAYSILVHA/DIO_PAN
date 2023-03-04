<h1 align="center">DIO_PAN</h1>

<p align="center">
    Repositório para guardar meu progresso no Bootcamp oferecido pela DIO em parceria com o Banco PAN!
</p>
<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-layout">Exemplos</a>
<br>
<p align="center">
  <img alt="Programação" src="https://1.bp.blogspot.com/-iGcngsQpp_U/X-kDS0OTcPI/AAAAAAAAccg/UTu5XcZJ_YIWaxd1LLMEs6PWINKaIQtpQCLcBGAsYHQ/s700/POST_MAT.jpg" width="100%">
</p>

>🟡 Projeto em construção

## 👩‍💻Tecnologias

<p>
Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java
- Intellij Idea
- Git e Github
</p>

## 💻 Projeto

Esse bootcamp tem o objetivo de ensinar, desde o básico, a linguagem de programação JAVA☕.

## Exemplos

<p>Aqui vão alguns exemplos de códigos que desenvolvemos durante o bootcamp:
</p>


### If e else:

```
public class ifElse {
    public static void main(String[] args) {
        Scanner digiteNumero = new Scanner(System.in);
        System.out.println("Digite o número do mês: ");
        int numeroMes = digiteNumero.nextInt();

        if (numeroMes==1){
            System.out.println("Janeiro");
        } else if (numeroMes==2) {
            System.out.println("Fevereiro");

        }else if (numeroMes==3) {
            System.out.println("Março");

        }else if (numeroMes==4) {
            System.out.println("Abril");

        }else if (numeroMes==5) {
            System.out.println("Maio");

        }else if (numeroMes==6) {
            System.out.println("Junho");

        }else if (numeroMes==7) {
            System.out.println("Julho");

        }else if (numeroMes==8) {
            System.out.println("Agosto");

        }else if (numeroMes==9) {
            System.out.println("Setembro");

        }else if (numeroMes==10) {
            System.out.println("Outubro");

        }else if (numeroMes==11) {
            System.out.println("Novembro");

        }else if (numeroMes==12) {
            System.out.println("Dezembro");

        }
        if(numeroMes==1 || numeroMes==7 || numeroMes==12){
            System.out.println("Mês de Férias!");
        }
    }

}
```

### Switch:

```
public class switchNumber {
    public static void main(String[] args) {
        Scanner digiteNumber= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroDigitado= digiteNumber.nextInt();


        switch (numeroDigitado){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor Indefinido");
        }
    }
}

```

### Arrays:
```
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}

```
