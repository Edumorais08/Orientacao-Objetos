import java.util.Scanner;

public class ContasBasicas {

    public static void main(String[] args) {

    int a;
    int b;
    int soma;
    int subtracao;
    int divisao;
    int multiplicacao;
    double potencia;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor de a:");
    a = sc.nextInt();
    System.out.println("Informe o valor de b:");
    b = sc.nextInt();

    soma = a + b;
    subtracao = a - b;
    divisao = a / b;
    multiplicacao = a * b;
    potencia = Math.pow(a, b);

    System.out.println("A soma de a + b é " + soma);
    System.out.println("A subtracao de a - b é " + subtracao);
    System.out.println("A divisao de a / b é " + divisao);
    System.out.println("A  de multiplicacao de a * b é " + multiplicacao);
    System.out.println("A potencia de a ^ b é " + potencia);

    }
}
