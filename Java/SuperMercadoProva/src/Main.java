import java.util.HashMap;
import java.util.Map;
public void main() {
}
        /* QUESTÃO 20 letra A - Corrigir o Bug,
        O Bug está na classe pedido, o método adicionaItem não está verificando se o produto já existe
        na lista de itens antes de adicioná-lo. Se o produto já existir, a quantidade será duplicada.
        Para corrigir o bug, vamos adicionar uma verificação antes de adicionar o item a lista,
        utilizando o método contains().
        */

        public boolean adicionaItem (Produto produto,int quantidade){
            if (listaItens.contains(produto)) {
                listaItens.get(posicao).quantidade += quantidade;
                return true;
            } else {
                listaItens.add(new Item(produto, quantidade));
                return false
            }
        }
        // QUESTÃO 20 letra B - Método onde receba um valor e retorne o troco.

        public class calculoTroco {
            public static Map<Integer, Integer> calcularTroco(int valorPago, int valorTotal) {
                Map<Integer, Integer> troco = new HashMap<>();
                int valorTroco = valorPago - valorTotal;
                int[] notasDisponivels = {100, 50, 20, 10, 5, 2};

                for (int nota : notasDisponivels) {
                    while (valorTroco >= nota) {
                        troco.put(nota, troco.getOrDefault(nota, 0) + 1);
                    }
                }
                return troco;
            }

            public static void main(String[] args) {
                int valorPago = ;
                int valorTotal = ;
                Map<Integer, Integer> troco = calcularTroco(valorPago, valorTotal);

                System.out.println("Troco: ");
                for (Map.Entry<Integer, Integer> entry : troco.entrySet()) {
                    System.out.println("  " + entry.getKey() + ": " + entry.getValue());
                }
            }
        }

        // QUESTÃO 20 letra C - Método onde receba um valor do troco e calcula a menor quantidade de notas.

        public class CalculadoraTrocoMinimo {

            public static Map<Integer, Integer> calcularTrocoMinimo(int valorTroco) {

            Map<Integer, Integer> troco = new HashMap<>();
            int[] notasDisponiveis = {100, 50, 20, 10, 5, 2};

            for (int nota : notasDisponiveis) {
            troco.put(nota, valorTroco / nota);
            valorTroco %= nota;
            }

            return troco;
        }

            public static void main(String[] args) {
            int valorTroco = 152;
            Map<Integer, Integer> trocoMinimo = calcularTrocoMinimo(valorTroco);

            System.out.println("Troco mínimo:");
            for (Map.Entry<Integer, Integer> entry : trocoMinimo.entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
                }
            }
        }


