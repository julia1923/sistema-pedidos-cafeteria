package ingredientes;

import produtos.Produto;

public class Leite implements Produto {

    private Produto cafe;

    public Leite(Produto cafe){
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + "+ leite ";
    }

    @Override
    public Double getPreco() {
        return cafe.getPreco() + 1.00;
    }
    
}
