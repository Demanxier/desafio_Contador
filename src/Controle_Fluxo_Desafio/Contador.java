package Controle_Fluxo_Desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero:");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é maior que parametroDois e lançar  a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo  numero deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;
        //realizar  o for para imprimir os numeros com base na variavel  contagem
        for (int i  = 1;i <= contagem; i++){
            System.out.println("Imprimindo o numero  " + i);
        }
    }
}
