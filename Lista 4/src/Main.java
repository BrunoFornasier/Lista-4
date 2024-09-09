
public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(50.0);
        IngressoVIP ingressoVIP = new IngressoVIP(50.0, 30.0);

        Evento evento = new Evento("Show de Rock", "10/10/2024", ingressoNormal, ingressoVIP);

        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Ingresso Normal: R$ " + evento.getIngressoNormal().getValor());
        System.out.println("Ingresso VIP: R$ " + evento.getIngressoVIP().getValor());
    }
}
