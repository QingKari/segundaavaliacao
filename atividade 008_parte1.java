import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibindo o resultado
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
