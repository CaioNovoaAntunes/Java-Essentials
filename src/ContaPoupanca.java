public class ContaPoupanca extends Conta{
    private Double rendimento;

    public ContaPoupanca(Double valor, String agencia, String numeroConta, Double rendimento) {
        super(valor, agencia, numeroConta);
        this.rendimento = rendimento;

    }

    public Double getRendimento() {
        return rendimento;
    }

    @Override
    public String deposita(Double valor, TaxaCambial taxac) {
        return super.deposita(valor, taxac);
    }
}
