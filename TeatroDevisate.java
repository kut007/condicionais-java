import java.util.Scanner;

public class TeatroDevisate {
    public static void main(String[] args) {
        new Teatro();
    }
}

class Teatro {

    int LINHAS = 12;
    int COLUNAS = 12;
    char LIVRE = 'L';
    char RESERVADA = 'R';
    char OCUPADA = 'X';

    String[] nomeSala = new String[3];
    String[] espetaculo = new String[3];
    double[] precoInteiro = new double[3];
    char[][][] grade = new char[3][12][12];

    int totalSalas = 0;

    Scanner sc = new Scanner(System.in);

    public Teatro() {
        nomeSala[0] = "Beethoven";
    espetaculo[0] = "Sla";
    precoInteiro[0] = 100.0;
    criarSala(0);

    nomeSala[1] = "Principal";
    espetaculo[1] = "Sla";
    precoInteiro[1] = 150.0;
    criarSala(1);

    totalSalas = 2;

        menuPrincipal();
    }

    void criarSala(int s) {
        for (int l = 0; l < LINHAS; l++) {
            for (int c = 0; c < COLUNAS; c++) {
                grade[s][l][c] = LIVRE;
            }
        }
    }

    void menuPrincipal() {

        int opcao;

        do {
            System.out.println("--- TEATRO DEVISATE ---");
            System.out.println("1 - Cadastrar nova sala");
            System.out.println("2 - Reservar cadeira");
            System.out.println("3 - Comprar ingresso");
            System.out.println("4 - Cancelar reserva");
            System.out.println("5 - Exibir mapa");
            System.out.println("6 - Relatorio financeiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1: cadastrarSala(); break;
                case 2: reservar(); break;
                case 3: comprar(); break;
                case 4: cancelar(); break;
                case 5: exibirMapa(); break;
                case 6: relatorio(); break;
                case 0: System.out.println("Saindo"); break;
            }

        } while (opcao != 0);
    }

    void cadastrarSala() {

        if (totalSalas >= 3) {
            System.out.println("Limite de salas atingido!");
            return;
        }

        System.out.print("Nome da sala: ");
        nomeSala[totalSalas] = sc.nextLine();

        System.out.print("Espetáculo: ");
        espetaculo[totalSalas] = sc.nextLine();

        System.out.print("Preço: ");
        precoInteiro[totalSalas] = sc.nextDouble();
        sc.nextLine();

        criarSala(totalSalas);
        totalSalas++;

        System.out.println("Sala cadastrada com sucesso!");
    }

    void reservar() {
        int sala = selecionarSala();
        if (sala == -1) return;

        System.out.println("Reserva para: " + nomeSala[sala]);
        
        int[] posicao_cad = selecionarCadeira();
        if (posicao_cad == null) return;

        int l = posicao_cad[0];
        int c = posicao_cad[1];

        if (grade[sala][l][c] == RESERVADA) {
            System.out.println("Erro: Esta cadeira ja esta reservada");
        } else if (grade[sala][l][c] == OCUPADA) {
            System.out.println("Erro: Esta cadeira ja esta ocupada");
        } else {

            grade[sala][l][c] = RESERVADA;

            double valorReserva = precoInteiro[sala] * 0.5;
            
            System.out.println("Reserva realizada com sucesso");
            System.out.println("Sala: " + nomeSala[sala]);
            System.out.println("Cadeira: " + (char)('A' + l) + (c + 1));
        }
    }

    int selecionarSala() {
        System.out.println("n fiz");
        return NAO_FIZ;
    }
    void comprar() {
        System.out.println("n fiz");
    }

    void cancelar() {
        System.out.println("n fiz");
    }

    void exibirMapa() {
        System.out.println("n fiz");
    }

    void relatorio() {
        System.out.println("n fiz");
    }

    
    int[] selecionarCadeira() {

        System.out.print("Linha (A-L): ");
        String l = sc.nextLine().toUpperCase();

        System.out.print("Coluna (1-12): ");
        int c = sc.nextInt() - 1;
        sc.nextLine();
        int linha = converterLinha(l);

        if (linha == -1 || c < 0 || c > 11) {
            System.out.println("Posicao invalida");
            return null;
        }

        return new int[]{linha, c};
    }


    int converterLinha(String l) {

        if (l.equals("A")) return 0;
        else if (l.equals("B")) return 1;
        else if (l.equals("C")) return 2;
        else if (l.equals("D")) return 3;
        else if (l.equals("E")) return 4;
        else if (l.equals("F")) return 5;
        else if (l.equals("G")) return 6;
        else if (l.equals("H")) return 7;
        else if (l.equals("I")) return 8;
        else if (l.equals("J")) return 9;
        else if (l.equals("K")) return 10;
        else if (l.equals("L")) return 11;

        return -1;
 }
}