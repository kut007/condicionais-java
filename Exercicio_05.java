import java.util.Scanner;

public class Exercicio_05{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N1;
        int N2;
        int selecao;
        int adicao;
        int subtracao;
        int multiplicacao;
        int divisao;

        System.out.println("Informe o primeiro número:");
        N1 = ler.nextInt();
        System.out.println("Informe o segundo número:");
        N2 = ler.nextInt();
        System.out.println("Escolha o operador (1) Adição (2) Subtração (3) Multiplicação (4) Divisão");
        selecao = ler.nextInt();
        switch (selecao) {
            case 1:
            adicao = N1 + N2;
            System.out.println("Resultado: "+adicao);
            break;
       
            case 2:
            subtracao = N1 - N2;
            System.out.println("Resultado: "+subtracao);
            break;
            
            case 3:
            multiplicacao = N1 * N2;
            System.out.println("Resultado: "+multiplicacao);
            break;
            case 4:
            divisao = N1 / N2;
            System.out.println("Resultado: "+divisao);
            break;

 }
    }

}