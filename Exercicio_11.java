import java.util.Scanner;

public class Exercicio_11{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Informe a sua idade:");
        idade = ler.nextInt();
        String resultado = (idade < 12) ? "O preço do seu ingresso sera de 10 Reais" : (idade > 12 && idade < 60) ? "O preço do ingresso sera de 20 Reais" : "O preço do ingresso sera de 10 Reais";
        System.out.println(resultado);
    }

}