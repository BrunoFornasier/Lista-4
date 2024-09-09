public class ContaEspecial extends ContaCorrente {
    private float limiteCredito;

    public ContaEspecial(String numeroConta, float saldo, float limiteCredito) {
        super(numeroConta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean sacar(float valor) {
        if (valor > 0 && valor <= (saldo + limiteCredito)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite de Crédito: R$ " + limiteCredito;
    }
}
