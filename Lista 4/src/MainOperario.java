public class MainOperario {
    public static void main(String[] args) {
        Empregado6 emp = new Empregado6("João Silva", 30, 2000);
        Operario op = new Operario("Ana Costa", 28, 1800, 5000, 10);

        System.out.println("Informações do Empregado:");
        System.out.println(emp);
        System.out.println("Salário: " + emp.calcularSalario());

        System.out.println("\nInformações do Operário:");
        System.out.println(op);
        System.out.println("Salário: " + op.calcularSalario());
    }
}
