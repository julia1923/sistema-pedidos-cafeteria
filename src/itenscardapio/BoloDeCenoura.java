package itenscardapio;

import produtos.Produto;

public class BoloDeCenoura implements Produto {

    private Produto pedido;

    public BoloDeCenoura (Produto pedido){
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
       return pedido.getDescricao() + "\nBolo de Cenoura";
    }

    @Override
    public Double getPreco() {
        return pedido.getPreco() + 7.00;
    }
    
}
