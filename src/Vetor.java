import javax.swing.*;

public class Vetor {

    public static void main(String[] args) {
        ///////////// ler um numero x de vetores inteiros,
        // armazena em vetor e ao final informa a qtd de num zeros

        String strTamanho = JOptionPane.showInputDialog("Informe a quantidade de números:");
        int tamanho = Integer.parseInt(strTamanho);

        //declarar e criar o vetor
        int vetor[]; //declaração do vetor
        vetor = new int[tamanho]; // criação do vetor

        //ler os valores do vetor
        for (int i = 0; i < tamanho; i++) {
            String strValor = JOptionPane.showInputDialog("Informe o valor do vetor[" + i + "]");
            vetor[i] = Integer.parseInt(strValor);
        }
        // contar o numero de zeros dentro do vetor
        int qtdZeros = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        int calcularMedia = 0;
        int qtdPares = 0;
        int qtdImpares = 0;


        for (int i = 0; i < vetor.length; i++) {
            calcularMedia += vetor[i];
            if (vetor[i] == 0) {
                qtdZeros++;
            }
            if (vetor[i] > 0) {
                qtdPositivos++;
            }
            if (vetor[i] < 0) {
                qtdNegativos++;
            }
            if (vetor[i] % 2 == 0) {
                qtdPares++;
            }
            if (vetor[i] % 2 == 1) {
                qtdImpares++;
            }
        }

        float media = calcularMedia / vetor.length;

        JOptionPane.showMessageDialog(null, """
                Quantidade de zeros no vetor = %d
                Quantidade de números positivos no vetor = %d
                Quantidade de números negativos no vetor = %d
                Quantidade de números pares no vetor = %d
                Quantidade de números ímpares no vetor = %d
                A média dos valores no vetor = %.2f
                """.formatted(qtdZeros, qtdPositivos, qtdNegativos, qtdPares, qtdImpares, media));
    }
}
