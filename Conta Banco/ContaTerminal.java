import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrando com nome de usuario da conta
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();

        System.out.println("Digite sua conta: ");
        int conta = entrada.nextInt();

        System.out.println("Digite sua agencia: ");
        int agencia = entrada.nextInt();

        System.out.println("Digite o Saldo: ");
        Double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: " + saldo + " já está disponível para saque");

    }
}