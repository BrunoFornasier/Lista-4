public class Empregado6 extends Pessoa6 {
    private double vencimentoBase;

    public Empregado6(String nome, int idade, double vencimentoBase) {
        super(nome, idade);
        this.vencimentoBase = vencimentoBase;
    }

    public double getVencimentoBase() {
        return vencimentoBase;
    }

    public void setVencimentoBase(double vencimentoBase) {
        this.vencimentoBase = vencimentoBase;
    }

    public double calcularSalario() {
        return vencimentoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário Base: " + vencimentoBase;
    }
}
