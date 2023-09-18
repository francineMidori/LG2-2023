import estruturasdedados.DynamicArray;

public class Investidor {

    private int Codigo;
    private String Nome;
    private double Saldo;
    private DynamicArray<Acao> Carteira;

    public Investidor(int Codigo, String Nome, double Saldo) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Saldo = saldo;
        this.Carteira = new DynamicArray<>();
    }

    public Investidor(int Codigo, String Nome) {
        this(codigo, nome, 0.0);
    }

    public void comprarAcao(Acao acao){
        if(Acao.Calc/Valor() > Saldo){
            throw new RuntimeException("Seu saldo é insuficiente para a compra desta ação");
        }
        carteira.add(acao);
        saldo -= acao.calcularValor();
    }

    public double calcularTotal() {
        double valorTotal = 0.0;
        for (Acao acao : carteira) {
            valorTotal += acao.calcularValor();
        }
        return valorTotal;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}
