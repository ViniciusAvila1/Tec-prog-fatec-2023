package exercises_23_09_2023.exercise10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int codigoProduto, quantidade;
        double valorUnitario, valorTotal, maiorValor, menorValor, valorMedio;

        // Lista de vendas
        Venda[] vendas = new Venda[10];

        // Coleta das vendas
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Informe o código do produto: ");
            codigoProduto = scanner.nextInt();

            System.out.println("Informe o valor unitário: ");
            valorUnitario = scanner.nextDouble();

            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();

            vendas[i] = new Venda(codigoProduto, valorUnitario, quantidade);

            // Calcula o valor total da venda
            valorTotal = vendas[i].getValorTotal();

            // Exibe o valor total da venda
            System.out.println("Valor total da venda: " + valorTotal);
        }

        // Calcula o valor médio das vendas
        valorMedio = 0;
        for (Venda venda : vendas) {
            valorMedio += venda.getValorTotal();
        }
        valorMedio /= vendas.length;

        // Calcula a maior e a menor venda
        maiorValor = vendas[0].getValorTotal();
        menorValor = vendas[0].getValorTotal();
        for (Venda venda : vendas) {
            if (venda.getValorTotal() > maiorValor) {
                maiorValor = venda.getValorTotal();
            } else if (venda.getValorTotal() < menorValor) {
                menorValor = venda.getValorTotal();
            }
        }

        // Exibe o valor total vendido
        System.out.println("Valor total vendido: " + valorMedio);

        // Exibe a quantidade total de itens vendidos
        int quantidadeTotal = 0;
        for (Venda venda : vendas) {
            quantidadeTotal += venda.getQuantidade();
        }
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotal);

        // Exibe o produto com maior venda
        System.out.println("Produto com maior venda:");
        System.out.println("Código: " + vendas[0].getCodigoProduto());
        System.out.println("Quantidade: " + vendas[0].getQuantidade());
        System.out.println("Valor total: " + vendas[0].getValorTotal());

        // Exibe o produto com menor venda
        System.out.println("Produto com menor venda:");
        System.out.println("Código: " + vendas[9].getCodigoProduto());
        System.out.println("Quantidade: " + vendas[9].getQuantidade());
        System.out.println("Valor total: " + vendas[9].getValorTotal());
    }
}