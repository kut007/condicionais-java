import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = ler.nextDouble();

        double desconto;

        desconto = (valor > 500) ? 0.20 : 0;

        desconto = (valor >= 200 && valor <= 500) ? 0.10 : desconto;

        desconto = (valor < 200) ? 0 : desconto;

        double valorFinal = valor - (valor * desconto);

        System.out.println("O Valor final da compra: " + valorFinal);

    }
}