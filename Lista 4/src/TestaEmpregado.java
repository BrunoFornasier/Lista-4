public class TestaEmpregado {
    public static void main(String[] args) {
        
        Empregado2 emp = new Empregado2("João Silva", 30, 101, 3000.00, 15.0);

        
        System.out.println("Detalhes do Empregado:");
        System.out.println(emp.toString());

        
        System.out.printf("Salário com imposto: %.2f%n", emp.calcularSalario());
    }
}
