package ingredientes;

import produtos.Produto;

public class Mel implements Produto {

    private Produto cha;

    public Mel(Produto cha){
        this.cha = cha;
    }

    @Override
    public String getDescricao() {
        return cha.getDescricao() + "+ mel ";
    }

    @Override
    public Double getPreco() {
        return cha.getPreco() + 1.00;
    }
    
}
