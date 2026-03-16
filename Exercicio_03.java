import java.util.Scanner;

public class Exercicio_03{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int media;

        System.out.println("Informe a media do aluno:");
        media = ler.nextInt();
        String resultado = (media >= 7) ? "Aprovado" : (media >= 5 && media < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

}