package ingredientes;

import produtos.Produto;

public class Chocolate implements Produto {

    private Produto cafe;

    public Chocolate(Produto cafe){
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + "+ chocolate ";
    }

    @Override
    public Double getPreco() {
        return cafe.getPreco() + 2.00;
    }
    
}
