import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite num1: ");
        int num1 = sc.nextInt();

        System.out.print("Digite num2: ");
        int num2 = sc.nextInt();

        System.out.print("Digite num3: ");
        int num3 = sc.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("Maior: " + num1);
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("Maior: " + num2);
        }

        else if (num3 > num1 && num3 > num2) {
            System.out.println("Maior: " + num3);
        }

        else if (num1 == num2 && num1 > num3) {
            System.out.println("Empate entre: " + num1 + " e " + num2);
        }

        else if (num1 == num3 && num1 > num2) {
            System.out.println("Empate entre: " + num1 + " e " + num3);
        }

        else if (num2 == num3 && num2 > num1) {
            System.out.println("Empate entre: " + num2 + " e " + num3);
        }

        else if (num1 == num2 && num2 == num3) {
            System.out.println("Empate entre os tres");
        }

    }
}