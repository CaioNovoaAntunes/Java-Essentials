public class TxReal implements TaxaCambial {
    Double valor = 0.80;


    @Override
    public Double aplicarTaxa() {
        return this.valor;
    }
}
