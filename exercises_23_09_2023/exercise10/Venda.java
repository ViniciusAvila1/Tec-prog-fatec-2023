package exercises_23_09_2023.exercise10;

public class Venda {

    private int codigoProduto;
    private double valorUnitario;
    private int quantidade;

    public Venda(int codigoProduto, double valorUnitario, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    // getters e setters
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorUnitario * quantidade;
    }

}
