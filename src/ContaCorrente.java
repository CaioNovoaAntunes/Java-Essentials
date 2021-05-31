public class ContaCorrente extends Conta {
    private Double taxa;

    public ContaCorrente(Double valor, String agencia, String numeroConta, Double taxa) {
        super(valor, agencia, numeroConta);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public String deposita(Double valor, TaxaCambial taxac) {
        return super.deposita(valor, taxac);
    }
}



