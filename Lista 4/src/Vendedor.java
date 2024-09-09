public class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return salario + (salario * (percentualComissao / 100));
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Salário base: R$ " + salario + 
               ", Salário com comissão: R$ " + calcularSalario() + 
               ", Percentual de comissão: " + percentualComissao + "%";
    }
}
