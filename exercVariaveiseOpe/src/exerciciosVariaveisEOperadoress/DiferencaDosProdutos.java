package exerciciosVariaveisEOperadoress;
import java.util.Scanner;

public class DiferencaDosProdutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o 1º valor: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite o 2º valor: ");
        float n2 = scan.nextFloat();
        System.out.println("Digite o 3º valor: ");
        float n3 = scan.nextFloat();
        System.out.println("Digite o 4º valor: ");
        float n4 = scan.nextFloat();

        float produtoN1N2 = (n1 * n2);
        float produtoN3N4 = (n3 * n4);
        float diferenca = produtoN1N2 - produtoN3N4;

        System.out.println("Foi calculado a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.");
        System.out.println("Diferença: " + diferenca);

    }
}
