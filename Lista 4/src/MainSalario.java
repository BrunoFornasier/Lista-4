public class MainSalario {
    public static void main(String[] args) {
        
        Empregado emp = new Empregado("João", 2500.0f);
        System.out.println(emp);

        
        Gerente gerente = new Gerente("Ana", 5000.0f, "TI");
        System.out.println(gerente);

        
        Vendedor vendedor = new Vendedor("Carlos", 2000.0f, 10.0f);
        System.out.println(vendedor);
    }
}
