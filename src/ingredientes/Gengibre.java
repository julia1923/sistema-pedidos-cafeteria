package ingredientes;

import produtos.Produto;

public class Gengibre implements Produto {

    private Produto cha;

    public Gengibre(Produto cha){
        this.cha = cha;
    }

    @Override
    public String getDescricao() {
        return cha.getDescricao() + "+ gengibre ";
    }

    @Override
    public Double getPreco() {
        return cha.getPreco() + 2.00;
    }
    
}
