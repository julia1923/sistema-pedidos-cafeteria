package itenscardapio;

import produtos.Produto;

public class PaoDeQueijo implements Produto {

    private Produto pedido;

    public PaoDeQueijo (Produto pedido){
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\nPão de queijo";
    }

    @Override
    public Double getPreco() {
        return pedido.getPreco() + 10.00;
    }
    
}
