package ingredientes;

import produtos.Produto;

public class Canela implements Produto {

    private Produto cafe;

    public Canela(Produto cafe){
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
       return cafe.getDescricao() + "+ canela ";
    }

    @Override
    public Double getPreco() {
       return cafe.getPreco() + 0.50;
    }
}
