import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 10: ");
        int num = ler.nextInt();


        if (num >= 1 && num <= 10) {

            switch (num) {

                case 1:
                    System.out.println("I");
                    break;

                case 2:
                    System.out.println("II");
                    break;

                case 3:
                    System.out.println("III");
                    break;

                case 4:
                    System.out.println("IV");
                    break;

                case 5:
                    System.out.println("V");
                    break;

                case 6:
                    System.out.println("VI");
                    break;

                case 7:
                    System.out.println("VII");
                    break;

                case 8:
                    System.out.println("VIII");
                    break;

                case 9:
                    System.out.println("IX");
                    break;

                case 10:
                    System.out.println("X");
                    break;
            }

        } else {
            System.out.println("Numero invalido");
        }
    }
}