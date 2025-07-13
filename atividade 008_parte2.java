import java.util.Scanner;

public class CalculoSalarioComAdicional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do salário-base
        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        // Entrada do percentual de aumento
        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        // Cálculo do salário final com reajuste
        double salarioFinal = salarioBase + (salarioBase * percentualAumento / 100);

        // Exibindo o salário final
        System.out.println("Salário final com reajuste: R$ " + salarioFinal);

        scanner.close();
    }
}
