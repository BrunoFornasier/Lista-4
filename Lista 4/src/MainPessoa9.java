public class MainPessoa9 {
    public static void main(String[] args) {
        
        Pessoa9 einstein = new Pessoa9("Albert Einstein", 14, 3, 1879);
        Pessoa9 newton = new Pessoa9("Isaac Newton", 4, 1, 1643);
        
        
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos.");
    }
}
