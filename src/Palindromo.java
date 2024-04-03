import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual palavra você deseja verificar se é um palíndromo?");
        String palavra = sc.nextLine();

        palavra = palavra.replaceAll(" ","");
        String palavraCerta = palavra.toLowerCase();
        System.out.println(palavraCerta);

        String palavraContrario = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraContrario += palavraCerta.charAt(i);
        }

        if (palavraCerta.equals(palavraContrario)) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}