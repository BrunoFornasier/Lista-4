
public class IngressoVIP extends Ingresso {
    private final double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getValor() {
        return super.getValor() + valorAdicional;
    }
}
