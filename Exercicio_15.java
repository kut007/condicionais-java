import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        //Nao funcionava com *==* entao eu utilizei equals que foi oque usaram no youtube
        String resultado =
                (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) ? "Acesso permitido" : "Acesso negado";


        System.out.println(resultado);

    }
}