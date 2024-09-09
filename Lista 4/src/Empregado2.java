public class Empregado2 extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado2(String nome, int idade, int codigoSetor, double salarioBase, double imposto) {
        super(nome, idade);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Código do Setor: " + codigoSetor + ", Salário Base: " + salarioBase + ", Imposto: " + imposto + "%";
    }
}
