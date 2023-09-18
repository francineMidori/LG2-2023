package classes;
public class AcaoII extends Acao {

    public AcaoII(int Id, String Nome, String Codigo, double Cotacao) {
        super(Id, Nome, Codigo, Cotacao);
    }

    @Override
    public double CalcValor() {
        return getCotacao();
    }
}
