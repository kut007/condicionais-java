import java.util.Scanner;

public class Exercicio_01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Numero;

        System.out.println("Ola, informe um numero:");
        Numero = ler.nextInt();
        String resultado = (Numero % 2 == 0) ? "O número é par" : "O número é impar";
        System.out.println(resultado);
    }

}