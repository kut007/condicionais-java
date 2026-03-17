import java.util.Scanner;

public class Exercicio_08{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double Kilos;
        double Altura;
        double IMC;

        System.out.println("Informe Quantos kilos voce tem:");
        Kilos = ler.nextDouble();
        System.out.println("Informe a sua altura:");
        Altura = ler.nextDouble();

        IMC = (Altura / Kilos );

        System.out.println("Seu imc e de: "+IMC);
        
        String resultado = (IMC < 18.5) ? "Abaixo do peso" : (IMC < 25) ? "Peso Normal" : (IMC < 30) ? "Sobrepeso" : "Obesidade";
        System.out.println(resultado);
        

    }
}