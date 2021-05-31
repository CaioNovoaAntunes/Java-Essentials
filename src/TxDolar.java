public class TxDolar implements TaxaCambial{
  private Double valor = 5.0;

    @Override
    public Double aplicarTaxa() {
    return this.valor;
    }

}
