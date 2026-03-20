import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = ler.nextInt();

        String resultado =
                (num % 3 == 0 && num % 5 == 0) ? "Multiplo de 3 e de 5" : (num % 3 == 0) ? "Multiplo apenas de 3" : (num % 5 == 0) ? "Multiplo apenas de 5" : "Nao e multiplo de 3 nem de 5";

        System.out.println(resultado);

    }
}