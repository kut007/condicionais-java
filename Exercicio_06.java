import java.util.Scanner;

public class Exercicio_06{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Ano;

        System.out.println("Informe um ano:");
        Ano = ler.nextInt();

        String resultado =
                (Ano % 400 == 0) ? "Ano bissexto" :
                (Ano % 100 == 0) ? "Nao e bissexto" :
                (Ano % 4 == 0) ? "Ano bissexto" :
                "Nao e bissexto";

        System.out.println(resultado);
 }
    }

