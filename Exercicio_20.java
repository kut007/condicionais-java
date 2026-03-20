import java.util.Random;
import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random fazer = new Random();

        int numMaquina = fazer.nextInt(3); 

        int jogador = 0;
        int maquina = 0;

        System.out.println("PEDRA PAPEL TESOURA");
        System.out.println("(0) Pedra (1) Papel (2) Tesoura");

        int numJogador = ler.nextInt();


        if (numJogador == 0 && numMaquina == 1) {
            maquina++;
        }
        else if (numJogador == 1 && numMaquina == 0) {
            jogador++;
        }
        else if (numJogador == 1 && numMaquina == 2) {
            maquina++;
        }
        else if (numJogador == 2 && numMaquina == 1) {
            jogador++;
        }
        else if (numJogador == 2 && numMaquina == 0) {
            maquina++;
        }
        else if (numJogador == 0 && numMaquina == 2) {
            jogador++;
        }
        String resultado =
                (jogador == 1) ? "Jogador venceu" :
                (maquina == 1) ? "Maquina venceu" :
                "Empate";

        System.out.println("Maquina escolheu: " + numMaquina);
        System.out.println(resultado);
    }
}