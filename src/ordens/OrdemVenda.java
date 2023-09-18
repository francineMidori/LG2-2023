package ordens;

import acoes.Acao;
import elementos.Investidor;

public class OrdemVenda extends Ordem {

    public OrdemVenda(Acao acao, Investidor investidor, double preco, int quantidade) {
        super(acao, investidor, preco, quantidade);
    }
}
