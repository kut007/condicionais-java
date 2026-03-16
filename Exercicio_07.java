import java.util.Scanner;

public class Exercicio_07{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Lado1;
        int Lado2;
        int Lado3;

        System.out.println("Informe o primeiro lado:");
        Lado1 = ler.nextInt();
        System.out.println("Informe o segundo lado:");
        Lado2 = ler.nextInt();
        System.out.println("Informe o terceiro lado:");
        Lado3 = ler.nextInt();

        if (Lado1 + Lado2 > Lado3 &&
            Lado1 + Lado3 > Lado2 &&
            Lado2 + Lado3 > Lado1) {

            if (Lado1 == Lado2 && Lado2 == Lado3) {

                System.out.println("Triangulo equilatero");

            } else if (Lado1 == Lado2 ||
                       Lado1 == Lado3 ||
                       Lado2 == Lado3) {

                System.out.println("Triangulo isosceles");

            } else {

                System.out.println("Triangulo escaleno");

            }

        } else {

            System.out.println("Nao forma um triangulo");

        }

    }
}


