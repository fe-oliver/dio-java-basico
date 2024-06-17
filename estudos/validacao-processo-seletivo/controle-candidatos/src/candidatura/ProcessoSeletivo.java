package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirSelecionados();
    }

    static void imprimirSelecionados () {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("IMprimindo a lista de candidatos informando o incide do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero "+ (indice+1) +" é "+ candidatos[indice]);
        }
        //forma abreviada de iteracao for each
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos() {
        // array com candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato+" Solicitou este valor de salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+ candidato+ " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }
        else if (salarioBase == salarioPretendido)
        System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
