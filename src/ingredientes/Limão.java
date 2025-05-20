package ingredientes;

import produtos.Produto;

public class Limão implements Produto {

    private Produto cha;

    public Limão(Produto cha){
        this.cha = cha;
    }

    @Override
    public String getDescricao() {
        return cha.getDescricao() + "+ limão ";
    }

    @Override
    public Double getPreco() {
        return cha.getPreco() + 0.50;
    }
    
}
