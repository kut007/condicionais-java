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
    String[] enunciados = new String[20];
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
        
        titulos[0]  = "Exercicio 01 - Par ou Impar";
        titulos[1]  = "Exercicio 02 - Maior de Dois Numeros";
        titulos[2]  = "Exercicio 03 - Aprovacao Escolar";
        titulos[3]  = "Exercicio 04 - Classificacao de Temperatura";
        titulos[4]  = "Exercicio 05 - Calculadora Simples com Switch";
        titulos[5]  = "Exercicio 06 - Ano Bissexto";
        titulos[6]  = "Exercicio 07 - Triangulo Valido";
        titulos[7]  = "Exercicio 08 - IMC";
        titulos[8]  = "Exercicio 09 - Dia da Semana com Switch";
        titulos[9]  = "Exercicio 10 - Positivo, Negativo ou Zero";
        titulos[10] = "Exercicio 11 - Ingresso de Cinema";
        titulos[11] = "Exercicio 12 - Nota por Conceito";
        titulos[12] = "Exercicio 13 - Estacao do Ano com Switch";
        titulos[13] = "Exercicio 14 - Maior de Tres Numeros";
        titulos[14] = "Exercicio 15 - Verificador de Login";
        titulos[15] = "Exercicio 16 - Multiplo de 3 e 5";
        titulos[16] = "Exercicio 17 - Desconto em Compra";
        titulos[17] = "Exercicio 18 - Numero Romano com Switch";
        titulos[18] = "Exercicio 19 - Velocidade e Multa";
        titulos[19] = "Exercicio 20 - Pedra, Papel e Tesoura";

        enunciados[0]  = "Leia um inteiro e informe se e par ou impar. Use operador ternario.";
        enunciados[1]  = "Leia dois inteiros e exiba o maior. Use operador ternario.";
        enunciados[2]  = "Leia a media (0-10): Aprovado >= 7, Recuperacao >= 5, Reprovado < 5.";
        enunciados[3]  = "Leia a temperatura: Frio < 15, Agradavel 15-25, Quente > 25. Use ternario aninhado.";
        enunciados[4]  = "Leia dois numeros e operador (+,-,*,/). Use switch. Trate divisao por zero.";
        enunciados[5]  = "Leia um ano e informe se e bissexto (div. por 4, exceto centenarios salvo div. por 400).";
        enunciados[6]  = "Leia tres lados: verifique triangulo valido e classifique (equilatero/isosceles/escaleno).";
        enunciados[7]  = "Leia peso e altura, calcule IMC (peso/altura^2): Abaixo do peso, Normal, Sobrepeso, Obesidade.";
        enunciados[8]  = "Leia numero de 1-7 e exiba o dia da semana. Use switch. Fora do intervalo: 'Dia invalido'.";
        enunciados[9]  = "Leia um numero e informe se e positivo, negativo ou zero. Use ternario aninhado.";
        enunciados[10] = "Cinema: menor 12 anos R$10, entre 12-60 R$20, acima 60 R$10. Leia idade e exiba valor.";
        enunciados[11] = "Leia nota (0-10) e exiba conceito: A (9-10), B (7-8), C (5-6), D (0-4).";
        enunciados[12] = "Leia mes (1-12) e exiba a estacao do ano no hemisferio sul. Use switch.";
        enunciados[13] = "Leia tres inteiros e exiba o maior. Trate empate.";
        enunciados[14] = "Usuario e senha fixos no codigo. Leia e exiba 'Acesso permitido' ou 'Acesso negado'. Use ternario.";
        enunciados[15] = "Leia inteiro: multiplo de 3 e 5, so de 3, so de 5, ou nenhum. Use ternario onde possivel.";
        enunciados[16] = "Compra: acima R$500 = 20% desc, R$200-500 = 10% desc, abaixo R$200 = sem desc. Exiba valor final.";
        enunciados[17] = "Leia numero de 1-10 e exiba em romano. Use switch.";
        enunciados[18] = "Leia velocidade e limite: Sem multa, Leve (ate 20%), Grave (20-50%), Gravissima (>50%).";
        enunciados[19] = "Dois jogadores escolhem pedra/papel/tesoura. Determine vencedor ou empate. Use ternario no resultado.";

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
            else if (!acao.equals("V")) executarExercicio(acao);
            
        } while (!acao.equals("V"));
    }

    void executarExercicio(String acao) {
        int num = Integer.parseInt(acao);

        System.out.println(titulos[num - 1] );
        System.out.println(enunciados[num - 1]);

        switch (num) {
            case 1:  Exercicio_01.main(new String[]{}); break;
            case 2:  Exercicio_02.main(new String[]{}); break;
            case 3:  Exercicio_03.main(new String[]{}); break;
            case 4:  Exercicio_04.main(new String[]{}); break;
            case 5:  Exercicio_05.main(new String[]{}); break;
            case 6:  Exercicio_06.main(new String[]{}); break;
            case 7:  Exercicio_07.main(new String[]{}); break;
            case 8:  Exercicio_08.main(new String[]{}); break;
            case 9:  Exercicio_09.main(new String[]{}); break;
            case 10: Exercicio_10.main(new String[]{}); break;
            case 11: Exercicio_11.main(new String[]{}); break;
            case 12: Exercicio_12.main(new String[]{}); break;
            case 13: Exercicio_13.main(new String[]{}); break;
            case 14: Exercicio_14.main(new String[]{}); break;
            case 15: Exercicio_15.main(new String[]{}); break;
            case 16: Exercicio_16.main(new String[]{}); break;
            case 17: Exercicio_17.main(new String[]{}); break;
            case 18: Exercicio_18.main(new String[]{}); break;
            case 19: Exercicio_19.main(new String[]{}); break;
            case 20: Exercicio_20.main(new String[]{}); break;
        }
    }
}