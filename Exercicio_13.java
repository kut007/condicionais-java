import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.print("Digite o numero do mes 1-12: ");
        mes = sc.nextInt();


        switch (mes) {

            case 1:
                System.out.println("Janeiro - Verao");
                break;

            case 2:
                System.out.println("Fevereiro - Verao");
                break;

            case 3:
                System.out.println("Março - Outono");
                break;

            case 4:
                System.out.println("Abril - Outono");
                break;

            case 5:
                System.out.println("Maio - Outono");
                break;

            case 6:
                System.out.println("Junho - Inverno");
                break;

            case 7:
                System.out.println("Julho - Inverno");
                break;

            case 8:
                System.out.println("Agosto - Inverno");
                break;

            case 9:
                System.out.println("Setembro - Primavera");
                break;

            case 10:
                System.out.println("Outubro - Primavera");
                break;

            case 11:
                System.out.println("Novembro - Primavera");
                break;

            case 12:
                System.out.println("Dezembro - Verao");
                break;
        }
    }
}