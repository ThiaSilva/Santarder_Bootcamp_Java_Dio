import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Entrada de dados pelo usuario

        System.out.println("Por favor, digite o número da conta! ");
        int numero = entrada.nextInt();

        System.out.println("Por favor, digite o número da agencia! ");
        String agencia = entrada.next();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = entrada.next();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco " + "sua agencia é: " + agencia + " Conta: " + agencia + " e saldo: " + saldo + " já disponivel para saque! ");
    }
}