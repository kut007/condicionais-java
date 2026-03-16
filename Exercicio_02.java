import java.util.Scanner;

public class Exercicio_02{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N1;
        int N2;

        System.out.println("Ola, informe o primeiro numero:");
        N1 = ler.nextInt();
        System.out.println("Ola, informe o segundo numero:");
        N2 = ler.nextInt();
        String resultado = (N1 > N2) ? "O primeiro numero é o maior" : "O segundo numero é o maior";
        System.out.println(resultado);
    }

}