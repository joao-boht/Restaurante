public class SistemaRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Prato prato1 = new Prato("Lasanha", 40.0, "Lasanha à bolonhesa");
        Prato prato2 = new Prato("Pizza", 60.0, "Pizza quatro queijos");

        restaurante.adicionarPratoCardapio(prato1);
        restaurante.adicionarPratoCardapio(prato2);

        Pedido pedido = new Pedido(1, "João Silva");
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        restaurante.criarPedido(pedido);
        restaurante.visualizarPedido(1);

        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}
