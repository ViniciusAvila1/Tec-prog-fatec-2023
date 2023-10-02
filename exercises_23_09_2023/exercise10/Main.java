package exercises_23_09_2023.exercise10;

public class Main {

    public static void main(String[] args) {

        // Declaração das variáveis
        int[] codigoProduto = new int[10];
        double[] valorUnitario = new double[10];
        int[] quantidade = new int[10];
        double valorTotal = 0.0;
        int quantidadeTotal = 0;
        Venda[] vendas = new Venda[10];

        // Entrada dos dados
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o código do produto: ");
            codigoProduto[i] = Integer.parseInt(System.console().readLine());
            System.out.println("Informe o valor unitário: ");
            valorUnitario[i] = Double.parseDouble(System.console().readLine());
            System.out.println("Informe a quantidade: ");
            quantidade[i] = Integer.parseInt(System.console().readLine());

            // Criação do objeto Venda
            vendas[i] = new Venda(codigoProduto[i], valorUnitario[i], quantidade[i]);
        }

        // Processamento dos dados
        for (int i = 0; i < 10; i++) {
            // Valor total da venda
            valorTotal += vendas[i].getValorTotal();

            // Quantidade total de itens vendidos
            quantidadeTotal += vendas[i].getQuantidade();
        }

        // Saída dos dados
        // Valor total vendido
        System.out.println("Valor total vendido: " + valorTotal);

        // Quantidade total de itens vendidos
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotal);

        // Valor médio vendido
        double valorMedio = valorTotal / 10;
        System.out.println("Valor médio vendido: " + valorMedio);

        // Produto com maior venda
        Venda vendaMaior = vendas[0];
        for (int i = 1; i < 10; i++) {
            if (vendas[i].getValorTotal() > vendaMaior.getValorTotal()) {
                vendaMaior = vendas[i];
            }
        }
        System.out.println("Produto com maior venda: " + vendaMaior.getCodigoProduto() + ", quantidade: " + vendaMaior.getQuantidade() + ", valor total: " + vendaMaior.getValorTotal());

        // Produto com menor venda
        Venda vendaMenor = vendas[0];
        for (int i = 1; i < 10; i++) {
            if (vendas[i].getValorTotal() < vendaMenor.getValorTotal()) {
                vendaMenor = vendas[i];
            }
        }
        System.out.println("Produto com menor venda: " + vendaMenor.getCodigoProduto() + ", quantidade: " + vendaMenor.getQuantidade() + ", valor total: " + vendaMenor.getValorTotal());
    }
}