package produtos;
public class CafeSimples implements Produto {

    @Override
    public String getDescricao() {
        return "Cafe ";
    }

    @Override
    public Double getPreco() {
        return 2.00;
    }
    
}
