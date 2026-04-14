/*3 - Relacionamentos e Encapsulamento
Exercício: E-commerce (Cliente -> Pedido -> ItemPedido).
Detalhes: Modelar um Pedido que pertence a um Cliente e contém uma Lista de
ItemPedido.
Regra de Negócio:
Calcular o Frete: Criar um método fecharPedido(). Se o valor total dos itens for superior a
R$ 250,00, o frete é grátis. Caso contrário, cobrar uma taxa fixa de R$ 25,00. Imprimir o recibo
detalhado.*/

public class Main {
    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido("Bolsa", 150.0, 1);
        ItemPedido item2 = new ItemPedido("Batons", 35.0, 4);
        ItemPedido item3 = new ItemPedido("Fones", 200.0, 3);

        Cliente c1 = new Cliente("Ana", "123.456.789-00");

        Pedido p1 = new Pedido(1, c1);

        p1.itens.add(item1);
        p1.itens.add(item2);
        p1.itens.add(item3);

        p1.CalculoTotal();
        p1.FecharPedido();
        p1.Recibo();
    }
}