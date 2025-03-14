import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Prato> cardapio;
    private List<Pedido> pedidos;

    public Restaurante() {
        cardapio = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void adicionarPratoCardapio(Prato prato) {
        if (prato != null && !cardapio.contains(prato)) {
            cardapio.add(prato);
            System.out.println("Prato adicionado ao cardápio: " + prato);
        } else {
            System.out.println("Prato já existe ou é inválido.");
        }
    }

    public void removerPratoCardapio(Prato prato) {
        if (cardapio.remove(prato)) {
            System.out.println("Prato removido do cardápio: " + prato);
        } else {
            System.out.println("Prato não encontrado no cardápio.");
        }
    }

    public void criarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
            System.out.println("Pedido criado com sucesso: " + pedido);
        }
    }

    public Pedido visualizarPedido(int numeroPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                System.out.println("Pedido encontrado: " + pedido);
                return pedido;
            }
        }
        System.out.println("Pedido não encontrado.");
        return null;
    }
}

