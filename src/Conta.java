public abstract class Conta {
    private Double valor;
    private String agencia;
    private String numeroConta;
    // private TaxaCambial taxac = new TaxaCambial();

    public Conta(Double valor, String agencia, String numeroConta) {
        this.valor = valor;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getValor() {
        return valor;
    }

    public String deposita(Double valor, TaxaCambial taxac) {
        this.valor += (valor - taxac.aplicarTaxa());

        return "depositado com suces " + valor;
    }


}
