import java.time.LocalDate;
import java.time.Period;

public class Pessoa9 {
    
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    
    public Pessoa9(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        calculaIdade(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }

    
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        Period periodo = Period.between(dataNascimento, dataAtual);
        idade = periodo.getYears();
    }

    
    public int informaIdade() {
        return idade;
    }

    
    public String informaNome() {
        return nome;
    }

    
    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
        calculaIdade(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }
}
