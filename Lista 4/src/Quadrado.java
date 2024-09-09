public class Quadrado extends Forma {
    private final double lado;

    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    
    @Override
    public void imprimirNome() {
        System.out.println("Quadrado");
    }
}
