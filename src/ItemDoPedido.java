public class ItemDoPedido {
    private int sequencial;
    private int quantidade;
    private Produto produto;
    private float valorItem;

    public ItemDoPedido(int sequencial, int quantidade, Produto produto) {
        this.sequencial = sequencial;
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorItem = produto.getValorProduto() * quantidade;
    }



    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
}
