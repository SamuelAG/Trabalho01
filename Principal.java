import java.util.Calendar;
import java.util.Date;


public class Principal {
    public static void main(String[] args) {

        /*Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00f);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 1300.00f);
        Produto p3 = new Produto(3, "GPS Garmin", 1500.00f);

        Vendedor vd1 = new Vendedor(38383,"Carlos",10.0f);

        Cliente c1 = new Cliente(2727,"Samuel",TipoCliente.PESSOA_FISICA);

        Veiculo v1 = new Veiculo(18181,"Ford Fiesta 2012",20000f);

        ItemDoPedido ip1 = new ItemDoPedido(1,2,p1);
        ItemDoPedido ip2 = new ItemDoPedido(2,4,p3);
        ItemDoPedido ip3 = new ItemDoPedido(3,2,p2);

        PedidoVenda pv1 = new PedidoVenda(1,c1,vd1,v1);


        pv1.addItemPedido(ip1);
        pv1.addItemPedido(ip2);
        pv1.addItemPedido(ip3);
        pv1.status();*/

        Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00f);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 1300.00f);

        Produto p3 = new Produto(3, "GPS Garmin", 1500.00f);
        Cliente c1 = new Cliente(1, "Egel Locadora", TipoCliente.PESSOA_JURIDICA);

        Cliente c2 = new Cliente(2, "Francisco José", TipoCliente.PESSOA_FISICA);

        Vendedor vd1 = new Vendedor(1,"José Emanuel", 5.00f);

        Veiculo v1 = new Veiculo(1,"Fiat Siena 2011", 32000.00f);
        Veiculo v2 = new Veiculo(2,"Wolks Gol 2011", 33000.00f);

        ItemDoPedido ip1 = new ItemDoPedido(1,4,p1);
        ItemDoPedido ip2 = new ItemDoPedido(2,  1,p2);
        ItemDoPedido ip3 = new ItemDoPedido(3,1,p3);

        PedidoVenda pv1 = new PedidoVenda(1,c1,vd1,v2);

        pv1.addItemPedido(ip1);
        pv1.addItemPedido(ip2);
        pv1.addItemPedido(ip3);
        pv1.toString();

    }
}
