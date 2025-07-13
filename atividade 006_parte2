import java.util.Scanner;

public class VerificacaoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante da taxa de desconto
        final double TAXA_DESCONTO = 0.10;

        // Entrada do preço do produto
        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        // Entrada do valor disponível do cliente
        System.out.print("Digite o valor disponível do cliente: ");
        double valorCliente = scanner.nextDouble();

        // Cálculo do preço com desconto
        double precoComDesconto = precoProduto - (precoProduto * TAXA_DESCONTO);

        // Verificando se o cliente pode comprar
        boolean compraPermitida = valorCliente >= precoComDesconto;

        // Exibindo o resultado
        System.out.println("Compra permitida: " + compraPermitida);

        // Fechando o scanner
        scanner.close();
    }
}
