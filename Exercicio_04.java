import java.util.Scanner;

public class Exercicio_04{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int temperatura;

        System.out.println("Informe a temperatura em graus celsius:");
        temperatura = ler.nextInt();
        String resultado = (temperatura < 15) ? "Está frio" : (temperatura >= 15 && temperatura <= 25 ) ? "Está Agradavel" : "Está Quente";
        System.out.println(resultado);
    }

}