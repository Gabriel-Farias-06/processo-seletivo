package candidatura;
import java.util.Scanner;
/**
 *
 * @author gabriel.rfarias
 */
public class ProcessoSeletivo {
    static Scanner sc = new Scanner(System.in);
    static double salarioBase = 2000.0;
    
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        double [] salarioPretendido = {1432.5, 1984.4, 1476.6, 3432.5, 2984.4, 2476.6, 2347.8, 1424.5, 1424.8, 2112.3};
        for (int i = 0; i < 10; i++) {
            avaliarCandidato(candidatos[i], salarioPretendido[i]);
        }
        String [] selecionados = selecionarCandidatos(candidatos, salarioPretendido);
        contatarSelecionado(selecionados);


    }

    public static void contatarSelecionado(String[] selecionados) {
        for (String selecionado : selecionados) {
            boolean respondeu = false;
            for(int i = 0; i < 3; i++) {
                System.out.println("Ligando para " + selecionado);
                System.out.print(selecionado + " atendeu? ");
                boolean atendeu = sc.nextBoolean();
                if (atendeu){
                    System.out.println("O candidato " + selecionado + " atendeu apos " + (i + 1) + " tentativas");
                    respondeu = true;
                    break;
                }
                else
                    System.out.println("O candidato não atendeu");
            }
            if (!respondeu)
                System.out.println("O candidato " + selecionado + " não retornou após 3 ligações");
        }
    }

    public static void imprimirSelecionados(String [] selecionados) {
        
        System.out.println("Imprimindo a Lista de Candidatos");

        for (String selecionado: selecionados)
            System.out.println("Candidato Selecionado: " + selecionado);
    }

    public static String[] selecionarCandidatos(String[] candidatos, double[] salarioPretendidos) {
        String [] selecionados = new String[5];
        int candidatoAtual = 0, qntddSelecionados = 0;
        while (qntddSelecionados < 5 && candidatoAtual < candidatos.length)  { 
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendidos[candidatoAtual];
            if (salarioPretendido < salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado");
                selecionados[qntddSelecionados] = candidato;
                qntddSelecionados++;
            }
            candidatoAtual++;
        }

        imprimirSelecionados(selecionados);
        return selecionados;
    }

    public static void avaliarCandidato(String nome, double salarioPretendido){
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
