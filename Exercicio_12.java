import java.util.Scanner;

public class Exercicio_12{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota de 0 a 10:");
        nota = ler.nextInt();
        String resultado = (nota >= 9 && nota < 11) ? "Sua nota e A" : (nota >= 7 && nota < 9) ? "Sua nota e B" : (nota >= 5 && nota < 7) ? "Sua nota e C" : (nota >= 0 && nota < 5) ? "Sua nota e D" : "Sua nota e invalida";
        System.out.println(resultado);
    }

}