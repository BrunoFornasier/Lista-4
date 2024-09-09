public class Vendedor7 extends Empregado7 {
    private double valorVendas;
    private double comissao;

    public Vendedor7(String nome, int idade, double salarioBase, double valorVendas, double comissao) {
        super(nome, idade, salarioBase);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (valorVendas * comissao / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor de Vendas: " + valorVendas + ", Comissão: " + comissao + "%";
    }
}
