public class Circulo extends Forma {
    private final double raio;

    
    public Circulo(double raio) {
        this.raio = raio;
    }

    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    
    @Override
    public void imprimirNome() {
        System.out.println("Círculo");
    }
}
