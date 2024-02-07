package exerciciosVariaveisEOperadoress;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário bruto: ");
        float salarioBruto = scan.nextFloat();
        System.out.println("Digite o valor do adicional noturno: ");
        float adicionalNoturno = scan.nextFloat();
        System.out.println("Digite o valor das horas extras: ");
        float horasExtras = scan.nextFloat();
        System.out.println("Digite o valor dos descontos: ");
        float descontos = scan.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        System.out.println("Seu salário líquido é de: " + salarioLiquido);
    }
}
