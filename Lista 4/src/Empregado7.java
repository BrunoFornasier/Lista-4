public class Empregado7 extends Pessoa {
    private double salarioBase;

    public Empregado7(String nome, int idade, double salarioBase) {
        super(nome, idade);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário Base: " + salarioBase;
    }
}
