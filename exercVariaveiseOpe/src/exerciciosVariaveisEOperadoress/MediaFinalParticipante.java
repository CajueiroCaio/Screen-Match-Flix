package exerciciosVariaveisEOperadoress;
import java.util.Scanner;

public class MediaFinalParticipante {
    public static void main(String[] args) {
        Scanner scanNota = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float nota1 = scanNota.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = scanNota.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = scanNota.nextFloat();
        System.out.println("Digite a nota 4: ");
        float nota4 = scanNota.nextFloat();

        float mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média final é de: " + mediaFinal);
    }
}
