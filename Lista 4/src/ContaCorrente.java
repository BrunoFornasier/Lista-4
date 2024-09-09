public class ContaCorrente {
    protected float saldo;
    private String numeroConta;

    public ContaCorrente(String numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta Corrente [Número: " + numeroConta + ", Saldo: R$ " + saldo + "]";
    }
}
