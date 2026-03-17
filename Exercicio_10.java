import java.util.Scanner;

public class Exercicio_10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero:");
        numero = ler.nextInt();
        String resultado = (numero >= 1) ? "O numero e positivo" : (numero == 0) ? "O numero e zero" : "O numero e negativo";
        System.out.println(resultado);
    }

}