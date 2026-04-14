public class ItemPedido {

    protected String nomeProduto;
    protected Double preco;
    Integer quantidade;

    public ItemPedido (String nomeProduto, Double preco, Integer quantidade){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
