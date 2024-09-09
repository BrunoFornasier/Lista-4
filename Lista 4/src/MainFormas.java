public class MainFormas {
    public static void main(String[] args) {
        Forma[] formas = new Forma[] {
            new Circulo(5.0),
            new Retangulo(4.0, 6.0),
            new Quadrado(3.0),
            new Triangulo(4.0, 5.0)
        };

        for (Forma forma : formas) {
            forma.imprimirNome();
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
