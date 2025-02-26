package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
         Scanner terminal = new Scanner(System.in);
         int [] argumentos = new int[2];
         argumentos[0] = terminal.nextInt();
         argumentos[1] = terminal.nextInt();

         try {
            contar(argumentos);
         } catch (Exception exception) {

         }
    }

    public static void contar(int[] args) throws ParametrosInvalidosException{
        if (args[0] > args[1]) throw ;
    }
}
