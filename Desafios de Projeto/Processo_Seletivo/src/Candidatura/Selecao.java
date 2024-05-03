package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Selecao {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        System.out.println("-----------------------------------------------");
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);
        }
    }

    // Método que entra em contato com os candidatos.
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " Tentativa ");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " Realizada");
    }

    // Método auxiliar.
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    // Método que imprime os selecionados.
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de N° " + (indice+1) + " é o " + candidatos[indice] );
        }
    }

    // M   étodo que seleciona os candidatos.
    static void selecaoCandidatos () {
        // Array com a lista de candidatos
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    // Método que simula o valor pretendido.
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método que faz a analise de selecao dos candidatos.
    static void analisarCandidato(double salarioPretendido){
      double salarioBase = 2000.0;
      if (salarioBase > salarioPretendido){
          System.out.println("Ligar para candidato");
      }
      else if (salarioBase == salarioPretendido) {
          System.out.println("Ligar para o candidato e oferecer uma proposta");
      }
      else {
          System.out.println("Aguardando resultados dos demais candidatos");
      }
    };
}