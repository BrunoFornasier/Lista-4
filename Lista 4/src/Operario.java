public class Operario extends Empregado6 {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int idade, double vencimentoBase, double valorProducao, double comissao) {
        super(nome, idade, vencimentoBase);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (valorProducao * comissao / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor da Produção: " + valorProducao + ", Comissão: " + comissao + "%";
    }
}
