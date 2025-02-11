package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARIA", "LUCAS", "JOÃO", "GEORGE"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while(continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
        } else 
            System.out.println("Não conseguimos contato com o candidato "  + candidato + " Número máximo atingido " + tentativasRealizadas);

    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARIA", "LUCAS", "JOÃO", "GEORGE"};
        for (String candidato: candidatos) {
            System.out.println(candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARIA", "LUCAS", "JOÃO", "GEORGE", "CLEBER", "MAX", "LEWIS", "CHARLES", "YUKI"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioRandom();
            System.out.printf("Este candidato %s solicitou o valor de %.2f%n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual ++;
        }
        System.out.println(candidatosSelecionados);

    }

    public static double salarioRandom() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisaCadidatio(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else 
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }
}
