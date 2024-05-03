package Controle;
import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Desafio Controle de fluxo");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Digite dois valores para saber o número de interações entre eles.");

        System.out.println("Digite o primeiro parametro: ");
        int paramentro1 = lerInteiro(input);

        System.out.println("Digite o segundo parametro: ");
        int paramentro2 = lerInteiro(input);

        try{
            contar(paramentro1, paramentro2);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException();
            }else {
                int diferenca = parametroDois - parametroUm;
                for (int i = 1; i <= diferenca; ++i) {
                    System.out.println("Imprimindo a " + i + "ª interação: " + i);
                }
            }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }

}
