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

    String[] titulos = new String[20];
    Scanner sc = new Scanner(System.in);

    public Teatro() {
        nomeSala[0] = "Beethoven";
        espetaculo[0] = "O heber";
        precoInteiro[0] = 100.0;
        criarSala(0);

        nomeSala[1] = "Principal";
        espetaculo[1] = "O titan";
        precoInteiro[1] = 150.0;
        criarSala(1);

        totalSalas = 2;
        
        for (int i = 0; i < 20; i++) {
            titulos[i] = "Exercicio " + (i + 1);
        }

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
        int opcao = -1;
        do {
            System.out.println("--- TEATRO DEVISATE ---");
            System.out.println("1 - Cadastrar nova sala");
            System.out.println("2 - Reservar cadeira");
            System.out.println("3 - Comprar ingresso");
            System.out.println("4 - Cancelar reserva");
            System.out.println("5 - Exibir mapa");
            System.out.println("6 - Relatorio financeiro");
            System.out.println("7 - Lista de Exercicios");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrarSala(); break;
                case 2: reservar(); break;
                case 3: comprar(); break;
                case 4: cancelar(); break;
                case 5: exibirMapa(); break;
                case 6: relatorio(); break;
                case 7: menuExercicios(); break;
                case 0: System.out.println("Saindo"); break;
            }
        } while (opcao != 0);
    }

    void cadastrarSala() {
        if (totalSalas >= 3) {
            System.out.println("Limite atingido");
            return;
        }
        System.out.print("Nome da sala: ");
        nomeSala[totalSalas] = sc.nextLine();
        System.out.print("Espetaculo: ");
        espetaculo[totalSalas] = sc.nextLine();
        System.out.print("Preco: ");
        precoInteiro[totalSalas] = sc.nextDouble();
        sc.nextLine();
        criarSala(totalSalas);
        totalSalas++;
    }

    int selecionarSala() {
        System.out.println("Selecione a sala:");
        System.out.println("1 - " + nomeSala[0]);
        System.out.println("2 - " + nomeSala[1]);
        if (totalSalas == 3) System.out.println("3 - " + nomeSala[2]);
        
        System.out.print("Opcao:");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3 && totalSalas == 3) return 2;

        System.out.println("Sala invalida!");
        return -1;
    }

    int[] selecionarCadeira() {
        System.out.print("Linha (A-L): ");
        String lStr = sc.nextLine().toUpperCase();
        System.out.print("Coluna (1-12): ");
        int c = sc.nextInt() - 1;
        sc.nextLine();
        int l = converterLinha(lStr);
        if (l != -1 && c >= 0 && c < 12) return new int[]{l, c};
        return null;
    }

    int converterLinha(String l) {
        if (l.equals("A")) return 0; if (l.equals("B")) return 1;
        if (l.equals("C")) return 2; if (l.equals("D")) return 3;
        if (l.equals("E")) return 4; if (l.equals("F")) return 5;
        if (l.equals("G")) return 6; if (l.equals("H")) return 7;
        if (l.equals("I")) return 8; if (l.equals("J")) return 9;
        if (l.equals("K")) return 10; if (l.equals("L")) return 11;
        return -1;
    }

    void reservar() {
        int s = selecionarSala();
        if (s == -1) return;
        int[] p = selecionarCadeira();
        if (p == null) return;
        if (grade[s][p[0]][p[1]] == LIVRE) {
            grade[s][p[0]][p[1]] = RESERVADA;
            System.out.println("Reservado Sinal: R$ " + (precoInteiro[s] * 0.5));
        } else System.out.println("Indisponivel");
    }

    void comprar() {
        int s = selecionarSala();
        if (s == -1) return;
        int[] p = selecionarCadeira();
        if (p == null) return;
        char est = grade[s][p[0]][p[1]];
        if (est == OCUPADA) System.out.println("Ja ocupada");
        else {
            double v = (est == RESERVADA) ? precoInteiro[s] * 0.5 : precoInteiro[s];
            grade[s][p[0]][p[1]] = OCUPADA;
            System.out.println("Vendido Valor: R$ " + v);
        }
    }

    void cancelar() {
        int s = selecionarSala();
        if (s == -1) return;
        int[] p = selecionarCadeira();
        if (p == null) return;
        if (grade[s][p[0]][p[1]] == RESERVADA) {
            grade[s][p[0]][p[1]] = LIVRE;
            System.out.println("Cancelado");
        } else System.out.println("Apenas reservas");
    }

    void exibirMapa() {
        int s = selecionarSala();
        if (s == -1) return;
        int li=0, re=0, oc=0;
        System.out.println("SALA: " + nomeSala[s]);
        System.out.print("    ");
        for (int i = 1; i <= 12; i++) {
            if (i < 10) System.out.print("0" + i + " ");
            else System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < LINHAS; i++) {
            System.out.print((char)('A' + i) + " | ");
            for (int j = 0; j < COLUNAS; j++) {
                char e = grade[s][i][j];
                String m = (e == RESERVADA) ? "[R]" : (e == OCUPADA) ? "[X]" : "[ ]";
                System.out.print(m + " ");
                if (e == LIVRE) li++; else if (e == RESERVADA) re++; else oc++;
            }
            System.out.println();
        }
        System.out.println("L: " + li + " R: " + re + " X: " + oc);
    }

    void relatorio() {
        int s = selecionarSala();
        if (s == -1) return;
        int r=0, o=0;
        for(int i=0; i<LINHAS; i++)
            for(int j=0; j<COLUNAS; j++){
                if(grade[s][i][j]==RESERVADA) r++;
                if(grade[s][i][j]==OCUPADA) o++;
            }
        System.out.println("\nRelatorio: " + nomeSala[s]);
        System.out.println("Vendas: R$ " + (o * precoInteiro[s]));
        System.out.println("Reservas: R$ " + (r * precoInteiro[s] * 0.5));
    }

    void menuExercicios() {
        int pag = 0;
        int totalPag = 3;
        String acao = "";
        do {
            int ini = pag * 7;
            int fim = (ini + 7 > 20) ? 20 : ini + 7;
            System.out.println("LISTA (Pag " + (pag + 1) + "/3)");
            for (int i = ini; i < fim; i++) System.out.println((i + 1) + " - " + titulos[i]);
            
            String nav = (pag > 0 ? "A - Anterior | " : "") + (pag < 2 ? "P - Proxima | " : "") + "V - Voltar";
            System.out.println(nav);
            System.out.print("Escolha: ");
            acao = sc.nextLine().toUpperCase();

            if (acao.equals("P") && pag < 2) pag++;
            else if (acao.equals("A") && pag > 0) pag--;
            else if (!acao.equals("V")) executarExercicio(); 
            
        } while (!acao.equals("V"));
    }

    void executarExercicio() {
    }
}