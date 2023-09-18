package acoes;

import elementos.Empresa;

public abstract class Acao {

    private int Id;
    private String Nome;
    private String Codigo;
    private Empresa empresa;
    private double Cotacao;

    public Acao(int Id, String Nome, String Codigo, Empresa empresa, double Cotacao) {
        this.Id = id;
        this.Nome = nome;
        setCodigo(Codigo);
        this.empresa = empresa;
        this.Cotacao = cotacao;
    }

    public Acao(int Id, String Nome, String Codigo, Empresa empresa) {
        this(id, nome, codigo, empresa, 0.0);
    }

    public abstract double CalcValor();

    public boolean ValCodigo(String Codigo) {

        return codigo.matches("^[A-Z]{4}[345678]$");
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        if(!validarCodigo(Codigo)) {
            throw new IllegalArgumentException("Formato de código incorreto.");
        }
        this.Codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public double getCotacao() {
        return Cotacao;
    }
}
