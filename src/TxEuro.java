public class TxEuro implements TaxaCambial {

        private Double valor = 7.0;


    @Override
    public Double aplicarTaxa() {
        return this.valor;
    }
}

