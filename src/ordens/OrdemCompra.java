package ordens;

import acoes.Acao;
import elementos.Investidor;

public class OrdemCompra extends Ordem{

    public OrdemCompra(Acao acao, Investidor investidor, double preco, int quantidade) {
        super(acao, investidor, preco, quantidade);
    }
}
