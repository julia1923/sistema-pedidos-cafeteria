package comandos;
import produtos.Produto;

public class FazerPedido implements Comando{

    private Produto produto;

    public FazerPedido(Produto produto){
        this.produto = produto;
    }

    @Override
    public void executar() {
        System.out.println("Pedido realizado!");
        System.out.println(produto.getDescricao());
        System.out.println("Valor total: R$ " + produto.getPreco());
    }
}
