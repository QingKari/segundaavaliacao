import java.util.Scanner;

public class CalculoNotaFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante da média de aprovação
        final double MEDIA_APROVACAO = 7.0;

        // Entrada das duas notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Verificação se foi aprovado
        boolean aprovado = media >= MEDIA_APROVACAO;

        // Exibindo o resultado
        System.out.println("Aprovado: " + aprovado);

        // Fechando o scanner
        scanner.close();
    }
}
