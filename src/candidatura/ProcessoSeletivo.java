package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String []  candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTU"};
        for (String  candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            //As variaveis precisarão  sofrer alterações
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("CONTATO RELAIZADO");

        } while (continuarTentando && tentativaRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizadas  + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMO DE TENTATIVAS " + tentativaRealizadas + " REALIZADAS.");
    }

    //Método auxiliar
    static boolean atender(){
        return  new Random().nextInt(3)==1;
    }



    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTU"};
        System.out.println("Imprimindo a lista de candidatos informando o  indice do elemento:");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o "  + candidatos[indice]);
        }
        System.out.println("Forma abrediada de interação do each");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos  = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE", "DEMANXIER"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "  solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato  " + candidato + " foi selecionado para a vaga.");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,  2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase  > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase  == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO O RESULTADO  DO DEMAIS CANDIDATOS");
        }
    }
}
