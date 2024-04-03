import java.util.Scanner;

public class MultiplicacaoMatriz {
    private static int linhasOuColunas(String mensagem, String letra) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de " + mensagem + " da matriz" + letra);
        int linhasOuColuna = sc.nextInt();

        return linhasOuColuna;
    }

    private static int[][] fazMatriz(int linhas, int colunas) {
        int matriz[][];
        matriz = new int[linhas][colunas];

        return matriz;
    }

    private static int[][] matrizCompleta(int linhas, int colunas, int[][] matriz, String letra) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println(String.format("Informe o número inteiro da matriz%s na posição[%d][%d]", letra, i + 1, j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    private static int[][] multiplicacaoMatriz(int[][] matrizA, int[][] matrizB, int linhasA, int colunasB, int colunasA) {
        int[][] matrizC = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return matrizC;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linhasA = linhasOuColunas("linhas", "A");
        int colunasA = linhasOuColunas("colunas", "A");
        int[][] matrizA = fazMatriz(linhasA, colunasA);
        matrizA = matrizCompleta(linhasA, colunasA, matrizA, "A");

        int linhasB = linhasOuColunas("linhas", "B");
        int colunasB = linhasOuColunas("colunas", "B");
        int[][] matrizB = fazMatriz(linhasB, colunasB);
        matrizB = matrizCompleta(linhasB, colunasB, matrizB, "B");

        if (colunasA == linhasB) {
            int[][] matrizC = multiplicacaoMatriz(matrizA, matrizB, linhasA, colunasB, colunasA);
            int i = 0;
            while (i < matrizC.length) {
                for (int j = 0; j < matrizC[i].length; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println();
                i++;

            }
        }
    }
}





