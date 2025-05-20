package comandos;
import java.util.Stack;

public class Garcom {
    private Stack<Comando> historico = new Stack<>(); //array que guarda os pedidos feitos.

    public void executarComando(Comando comando){
        comando.executar(); // chama o método executar da interface comando e imprime o que foi pedido e o valor.
        historico.push(comando); //"push" coloca um item no topo da linha
    }

    public void refazerUltimoPedido(){
        if (!historico.isEmpty()){ // se o histórico não estiver vazio 
            System.out.println("Refazendo último pedido. . .");
            Comando ultimo = historico.peek(); // pega o último pedido feito
            ultimo.executar(); // e o pedido é refeito.
        } else{
            System.out.println("Nenhum pedido anterior para refazer."); // se o histórico estiver vazio, não é refeito nenhum pedido
        } 
    }
}
