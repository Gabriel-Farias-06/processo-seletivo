package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
         Scanner terminal = new Scanner(System.in);
         int [] argumentos = new int[2];
         System.out.println("Insira o 1° valor");
         argumentos[0] = terminal.nextInt();
         System.out.println("Insira o 2° valor");
         argumentos[1] = terminal.nextInt();

         try {
            int limite = contar(argumentos);
            for(int i = 0; i != limite; i++)
                System.out.println(i + 1);
         } catch (ParametrosInvalidosException exception) {
            System.out.println("Parâmetros inválidos, o primeiro valor deve ser menor que o segundo");
         }
    }

    public static int contar(int[] args) throws ParametrosInvalidosException{
        if (args[0] > args[1]) throw new ParametrosInvalidosException();
        return  (args[1] - args[0]);
    }
}
