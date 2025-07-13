import java.util.Scanner;

public class ExemploWrappers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de número em String
        System.out.print("Digite um número inteiro (em texto): ");
        String numeroTexto = scanner.nextLine();

        // Converte String para int usando Integer.parseInt()
        int numero = Integer.parseInt(numeroTexto);
        System.out.println("Número + 10: " + (numero + 10));

        // Entrada de um caractere
        System.out.print("Digite um caractere: ");
        char caractere = scanner.nextLine().charAt(0);

        // Verifica se é letra usando Character.isLetter()
        boolean ehLetra = Character.isLetter(caractere);
        System.out.println("É uma letra? " + ehLetra);

        // Entrada de uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Usa método da classe String: toUpperCase() e length()
        System.out.println("Frase em maiúsculo: " + frase.toUpperCase());
        System.out.println("Quantidade de caracteres: " + frase.length());

        scanner.close();
    }
}
