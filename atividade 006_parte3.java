import java.util.Scanner;

public class TriagemDoacaoSangue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante do peso mínimo
        final double PESO_MINIMO = 50.0;

        // Entrada da idade
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // Entrada do peso corporal
        System.out.print("Digite o peso corporal da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        // Verificando se a pessoa é apta para doar sangue
        boolean aptoParaDoar = idade >= 18 && peso >= PESO_MINIMO;

        // Exibindo o resultado
        System.out.println("Apto para doar: " + aptoParaDoar);

        // Fechando o scanner
        scanner.close();
    }
}
