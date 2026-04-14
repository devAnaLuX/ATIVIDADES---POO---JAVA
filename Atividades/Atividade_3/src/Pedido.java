import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Integer idPedido;
    Double valorTotal = 0.0, valorItens, frete;
    List<ItemPedido>itens;
    Cliente cliente;

    public Pedido(Integer idPedido, Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void CalculoTotal(){
        this.valorItens = 0.0;
        for(ItemPedido item : this.itens) {
            this.valorItens += item.getPreco()*item.getQuantidade();
        }
    }

    public void FecharPedido(){
        if(valorItens>250.0){
            frete = 0.0;
            valorTotal += frete + valorItens;
        }
        else{
            frete = 25.0;
            valorTotal += frete + valorItens;
        }
    }

    public void Recibo(){
        System.out.println("ID Pedido: "+idPedido);
        System.out.println("--------------------------------------");
        System.out.println("Nome: "+this.cliente.getNome()+" | CPF: "+this.cliente.getCpf());
        System.out.println("--------------------------------------");
        System.out.println("Itens:");

        for(ItemPedido item : itens){
            System.out.println(item.quantidade+"x "+item.nomeProduto+" | R$"+ item.preco);
        }

        System.out.println("--------------------------------------");
        System.out.println("Total pedido: R$"+valorTotal);
        System.out.println("Frete: R$"+ frete);
    }

}
