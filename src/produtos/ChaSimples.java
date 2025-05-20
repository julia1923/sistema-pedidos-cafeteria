package produtos;
public class ChaSimples implements Produto {

    @Override
    public String getDescricao() {
        return "Chá ";
    }

    @Override
    public Double getPreco() {
        return 1.00;
    }
    
}
