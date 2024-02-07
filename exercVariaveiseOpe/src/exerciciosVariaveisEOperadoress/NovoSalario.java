package exerciciosVariaveisEOperadoress;

import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        float salario = scan.nextFloat();
        System.out.println("Qual o Abono? ");
        float abono = scan.nextFloat();
        float novoSalario = salario + abono;
        System.out.println("Esse é o seu novo salário: " + novoSalario);
    }
}