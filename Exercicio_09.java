import java.util.Scanner;

public class Exercicio_09{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int selecao;

        System.out.println("Informe um numero do dia da semana:");
        selecao = ler.nextInt();

        if (selecao > 1 || selecao < 7 ) {
        switch (selecao) {
            case 1:
            System.out.println("Ola, hoje e domingo");
            break;

            case 2:
            System.out.println("Ola, hoje e Segunda-Feira");
            break;

            case 3:
            System.out.println("Ola, hoje e Terça-Feira");
            break;

            case 4:
            System.out.println("Ola, hoje e Quarta-Feira");
            break;

            case 5:
            System.out.println("Ola, hoje e Quinta-Feira");
            break;

            case 6:
            System.out.println("Ola, hoje e Sexta-Feira");
            break;

            case 7:
            System.out.println("Ola, hoje e Sabado");
            break;
}
 } else {
    System.out.println("Informe um numero valido");
 }       
    }
}