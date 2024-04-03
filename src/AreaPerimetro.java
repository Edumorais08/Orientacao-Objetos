import java.util.Scanner;

public class AreaPerimetro {

    public static void circulo() {

        Scanner sc = new Scanner(System.in);

        double perimetro,
                area,
                raio;

        System.out.println("Informe o raio do círculo");
        raio = sc.nextFloat();

        perimetro = 2 * raio * Math.PI;
        area = raio * raio * Math.PI;
        System.out.println("O perímetro do círculo é " + perimetro + " e a área é " + area);
    }

    public static void quadrado() {

        Scanner sc = new Scanner(System.in);

        double perimetro,
                area,
                lado;

        System.out.println("Informe o lado do quadrado");
        lado = sc.nextFloat();

        perimetro = 4 * lado;
        area = lado * lado;
        System.out.println("O perímetro do quadrado é " + perimetro + " e a área é " + area);
    }

    public static void retangulo() {

        Scanner sc = new Scanner(System.in);

        double perimetro,
                area,
                base,
                altura;

        System.out.println("Informe a base do retângulo");
        base = sc.nextFloat();
        System.out.println("Informe a altura do retângulo");
        altura = sc.nextFloat();

        perimetro = 2 * (base + altura);
        area = base * altura;
        System.out.println("O perímetro do retângulo é " + perimetro + " e a área é " + area);
    }

    public static void trapezio() {

        Scanner sc = new Scanner(System.in);

        double perimetro,
                area,
                baseMaior,
                baseMenor,
                altura,
                ladoA,
                ladoB;


        System.out.println("Informe a base maior do trapézio");
        baseMaior = sc.nextFloat();
        System.out.println("Informe a base menor do trapézio");
        baseMenor = sc.nextFloat();
        System.out.println("Informe a altura do trapézio");
        altura = sc.nextFloat();
        System.out.println("Informe o lado A do trapézio");
        ladoA = sc.nextFloat();
        System.out.println("Informe o lado B do trapézio");
        ladoB = sc.nextFloat();

        perimetro = baseMaior + baseMenor + ladoA + ladoB;
        area = (baseMaior + baseMenor) * altura / 2;
        System.out.println("O perímetro do trapézio é " + perimetro + " e a área é " + area);
    }

    public static void triangulo() {

        Scanner sc = new Scanner(System.in);

        double perimetro,
                area,
                base,
                ladoB,
                ladoC,
                altura,
                modulo1,
                modulo2,
                modulo3;

        System.out.println("Informe o lado A do triângulo");
        base = sc.nextFloat();
        System.out.println("Informe o lado B do triângulo");
        ladoB = sc.nextFloat();
        System.out.println("Informe o lado C do triângulo");
        ladoC = sc.nextFloat();
        System.out.println("Informe a altura do triângulo");
        altura = sc.nextFloat();

        modulo1 = Math.abs(ladoB - ladoC);
        modulo2 = Math.abs(base - ladoC);
        modulo3 = Math.abs(base - ladoB);
/// verificando se da para formar um triangulo
        if (modulo1 < base && base < ladoB + ladoC && modulo2 < ladoB && ladoB < base + ladoC && modulo3 < ladoC &&
                ladoC < base + ladoB) {
            perimetro = base + ladoB + ladoC;
            area = base * altura / 2;
            System.out.println("O perímetro do triângulo é " + perimetro + " e a área é " + area);
        } else {
            System.out.println("os lados informados não são capazes de formar um triângulo");
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("""
        Digite o número da figura geométrica desejada:
          
        1 - Circulo  
        2 - Quadrado  
        3 - Retângulo  
        4 - Trapézio
        5 - triângulo  
                """);
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                circulo();
                break;
            case 2:
                quadrado();
                break;
            case 3:
                retangulo();
                break;
            case 4:
                trapezio();
                break;
            case 5:
                triangulo();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
