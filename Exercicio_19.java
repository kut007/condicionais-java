import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Velocidade: ");
        double velocidade = ler.nextDouble();

        System.out.print("Limite: ");
        double limite = ler.nextDouble();


        if (velocidade <= limite) {
            System.out.println("Sem multa");
        }

        else if (velocidade <= limite * 1.2) {
            System.out.println("Multa leve");
        }

        else if (velocidade <= limite * 1.5) {
            System.out.println("Multa grave");
        }

        else {
            System.out.println("Multa gravissima + suspensao");
        }
    }
}