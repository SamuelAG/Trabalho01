import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PedidoVenda {
    private int codigo;
    private Date data;
    private List<ItemDoPedido>itens = new ArrayList<ItemDoPedido>();
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private float valorPedido;

    public PedidoVenda(int codigo, Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.data =  new Date();
    }

    public void calcularPedido(){
        for(int i = 0;i<itens.size();i++){
            this.valorPedido += itens.get(i).getValorItem();
        }
    }

    public void addItemPedido(ItemDoPedido itemDoPedido){
        itens.add(itemDoPedido);
    }

    @Override
    public String toString() {
        float soma = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(this.data);
        for(int i = 0;i<itens.size();i++){
            this.valorPedido += itens.get(i).getValorItem();
        }
        System.out.println("\t\t\t\t\t\t  PEDIDO DE VENDA");
        System.out.println("Numero do Pedido: " + getCodigo() + "\t\t\t\t\t\t\t\tData do Pedido: " + dataFormatada);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.printf("Veiculo: %s   Valor: %.2f\n",veiculo.getDescricao(),veiculo.getValor());
        System.out.println("-------------------------Itens do Pedido--------------------");
        System.out.println("#Item  Descrição\t\t\t\t\t\t\t\t\tQtd   -Valor Unitario-      -Valor Item-");
        for(int i =0 ;i<itens.size();i++){
            System.out.printf("%5d  %-30s\t\t\t\t  %-3d %15.2f   %15.2f\n",itens.get(i).getSequencial(),itens.get(i).getProduto().getDescricao(),itens.get(i).getQuantidade(),itens.get(i).getProduto().getValorProduto(),itens.get(i).getValorItem());
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("Valor do Pedido: %.2f\n",veiculo.getValor() + this.valorPedido);
        System.out.printf("Comissão do Vendedor: %.2f\n",(veiculo.getValor() + this.valorPedido)/vendedor.getComissão());
        return super.toString();
}



    public void status(){
        float soma = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(this.data);
        for(int i = 0;i<itens.size();i++){
            soma += itens.get(i).getValorItem();
        }
        System.out.println("\t\t\t\t\t\t  PEDIDO DE VENDA");
        System.out.println("Numero do Pedido: " + getCodigo() + "\t\t\t\t\t\t\t\tData do Pedido: " + dataFormatada);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.printf("Veiculo: %s   Valor: %.2f\n",veiculo.getDescricao(),veiculo.getValor());
        System.out.println("-------------------------Itens do Pedido--------------------");
        System.out.println("#Item  Descrição\t\t\t\t\t\t\t\t\tQtd   -Valor Unitario-      -Valor Item-");
        for(int i =0 ;i<itens.size();i++){
            System.out.printf("%5d  %-30s\t\t\t\t  %-3d %15.2f   %15.2f\n",itens.get(i).getSequencial(),itens.get(i).getProduto().getDescricao(),itens.get(i).getQuantidade(),itens.get(i).getProduto().getValorProduto(),itens.get(i).getValorItem());
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("Valor do Pedido: %.2f\n",veiculo.getValor() + soma);
        System.out.printf("Comissão do Vendedor: %.2f\n",(veiculo.getValor() + soma)/10);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemDoPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }
}
