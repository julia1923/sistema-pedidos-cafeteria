package principal;

import java.util.Scanner;

import comandos.Comando;
import comandos.FazerPedido;
import comandos.Garcom;
import ingredientes.Canela;
import ingredientes.Chocolate;
import ingredientes.Gengibre;
import ingredientes.Leite;
import ingredientes.Limão;
import ingredientes.Mel;
import itenscardapio.BoloDeCenoura;
import itenscardapio.Cookie;
import itenscardapio.PaoDeQueijo;
import produtos.CafeSimples;
import produtos.ChaSimples;
import produtos.Produto;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Produto bebida = null; // bebida que o usuário ira escolher deve conter fora do bloco de escolha de
                               // bebida para poder se acessada pelo codigo todo.

        int escolha = 0;

        System.out.println("Escolha sua bebida!\n[1] Café\n[2] Chá ");
        escolha = leia.nextInt();

        switch (escolha) {

            case 1:
                bebida = new CafeSimples();
                break;

            case 2:
                bebida = new ChaSimples();
                break;
            default:
                System.out.println("Produto indisponível no cardápio.");
                break;
        }

        boolean escolhendo = true;

        if (escolha == 1) {
            while (escolhendo) {

                int opcao = 0;

                System.out.println(
                        "Qual ingrediente gostaria de acrescentar?\n[1] Mel\n[2] Leite\n[3] Canela\n[4] Chocolate\n[0] Finalizar pedido");
                opcao = leia.nextInt();
                leia.nextLine(); // limpeza do buffer para a entrada de dados em "refazer pedido".

                switch (opcao) {
                    case 1:
                        bebida = new Mel(bebida);

                        break;
                    case 2:
                        bebida = new Leite(bebida);

                        break;
                    case 3:
                        bebida = new Canela(bebida);
                        break;
                    case 4:
                        bebida = new Chocolate(bebida);
                        break;
                    case 0:
                        escolhendo = false;
                        break;
                    default:
                        System.out.println("Valor inválido.");
                        break;
                }
            }
        } else if (escolha == 2) {

            while (escolhendo) {
                int opcao = 0;

                System.out.println(
                        "Qual ingrediente gostaria de acrescentar?\n[1] Mel\n[2] Canela\n[3] Gengibre\n[4] Limão\n[0] Finalizar pedido");
                opcao = leia.nextInt();
                leia.nextLine(); // limpeza do buffer para a entrada de dados em "refazer pedido".

                switch (opcao) {
                    case 1:
                        bebida = new Mel(bebida);

                        break;
                    case 2:
                        bebida = new Canela(bebida);

                        break;
                    case 3:
                        bebida = new Gengibre(bebida);
                        break;
                    case 4:
                        bebida = new Limão(bebida);
                        break;
                    case 0:
                        escolhendo = false;
                        break;
                    default:
                        System.out.println("Valor inválido.");
                        break;
                }
            }
        }

        System.out.println("Deseja complementar seu pedido?\n[1] Bolo de cenoura\n[2] Cookie\n[3] Pão de Queijo");
        escolha = leia.nextInt();
        leia.nextLine(); // Limpeza do buffer

        switch (escolha) {
            case 1:
                bebida = new BoloDeCenoura(bebida);
                break;
            case 2:
                bebida = new Cookie(bebida);
                break;
            case 3:
                bebida = new PaoDeQueijo(bebida);
            default:
                System.out.println("Valor inválido.");
                break;
        }

        // Criando o pedido com o padrão command

        Comando pedido = new FazerPedido(bebida);

        Garcom garcom = new Garcom();

        garcom.executarComando(pedido);

        // Refazer o último pedido
        System.out.println("Gostaria de refazer o último pedido? (S/N)");

        String refazer = leia.nextLine();

        if (refazer.equalsIgnoreCase("s")) {
            garcom.refazerUltimoPedido();
        } else if (refazer.equalsIgnoreCase("n")) {
            System.out.println("Obrigado e volte sempre!");
        }

        leia.close();

    }
}