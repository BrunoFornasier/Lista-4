public class TesteVendedor {
    public static void main(String[] args) {
        
        Vendedor7 vendedor = new Vendedor7("João Silva", 30, 2000.0, 5000.0, 10.0);

        
        System.out.println(vendedor.toString());

        
        System.out.println("Salário Total: " + vendedor.calcularSalario());
    }
}
