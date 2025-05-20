package itenscardapio;

import produtos.Produto;

public class Cookie implements Produto {

    private Produto pedido;

    public Cookie(Produto pedido){
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\nCookie com gotas de chocolate";
    }

    @Override
    public Double getPreco() {
        return pedido.getPreco() + 8.00;
    }
    
}
