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
        avaliarCandidato(1900.0);
        avaliarCandidato(2200.0);
        avaliarCandidato(2000.0);
    }

    public static void selecionarCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int selecionados = 0;
        int candidatoAtual = 0;
        while (selecionados < 5 && candidatoAtual < candidatos.length) { 
            String candidato = candidatos[candidatoAtual];
            System.out.println("Defina o salário pretendido do candidato " + candidato);
            double salarioPretendido = sc.nextDouble();
            if (salarioPretendido >= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado");
                selecionados++;
            }
            candidatoAtual++;
        }
    }

    public static void avaliarCandidato(double salarioPretendido){
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
