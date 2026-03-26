import java.util.Scanner;
public class TeatroDevisate {
    public static void main(String[] args) {
        Teatro teatro = new Teatro();
    }
}

class Teatro {

    int LINHAS    = 12;
    int COLUNAS   = 12;
    char LIVRE     = 'L';
    char RESERVADA = 'R';
    char OCUPADA   = 'X';


    String[] nomeSala     = new String[3];
    String[] espetaculo   = new String[3];
    double[] precoInteiro = new double[3];
    char[][][] grade      = new char[3][12][12]; 
    int totalSalas        = 0;


    Scanner sc = new Scanner(System.in);


        int opcao;
        do {
            System.out.println("\n===========================================");
            System.out.println("        TEATRO DEVISATE - MENU PRINCIPAL    ");
            System.out.println("===========================================");
            System.out.println("  1 - Cadastrar nova sala");
            System.out.println("  2 - Reservar cadeira");
            System.out.println("  3 - Comprar ingresso");
            System.out.println("  4 - Cancelar reserva");
            System.out.println("  5 - Exibir mapa da sala");
            System.out.println("  6 - Relatorio financeiro");
            System.out.println("  7 - Lista de exercicios");
            System.out.println("  0 - Sair");
            System.out.println("===========================================");
            System.out.print("  Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                if (totalSalas >= 3) {
                    System.out.println("\n  Limite de 3 salas atingido.");
                } else {
                    System.out.println("");
            } else if (opcao == 2) {
                System.out.println("Reserva cadeira");
            } else if (opcao == 3) {
                System.out.println("");
            } else if (opcao == 4) {
                System.out.println("");
            } else if (opcao == 5) {
                System.out.println("");
            } else if (opcao == 6) {
                System.out.println("");
            } else if (opcao == 7) {
                System.out.println("");
            }

        } while (opcao != 0); 
        }
        }
    
    

