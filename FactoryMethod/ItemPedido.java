public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private int precoUnitarioEmCentavos;

    // Construtor
    public ItemPedido(Produto produto, int quantidade, int valorEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioEmCentavos = valorEmCentavos;
    }

    // Método que calcula o valor total do item
    public int valor() {
        return quantidade * precoUnitarioEmCentavos;
    }

    // Getters e Setters
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoUnitarioEmCentavos() {
        return precoUnitarioEmCentavos;
    }

    public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }
}
