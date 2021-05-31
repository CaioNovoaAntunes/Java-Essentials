public class Aplicativo {
    public static void main(String[] args) {

       // TxDolar taxac = new TxDolar();
        TaxaCambial  taxac = new TxReal();

        ContaCorrente c = new ContaCorrente(200.0, "123123", "23234", 30.0);

        ContaPoupanca p = new ContaPoupanca(150.0, "12341234", "232456", 0.1);

        System.out.println(p.getRendimento());
        System.out.println(c.getTaxa());


        p.deposita(200.0,taxac);
        System.out.println(p.getValor());





        c.deposita(100.00, taxac);
        System.out.println(c.getValor());

    }
}
