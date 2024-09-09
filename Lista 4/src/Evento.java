
public class Evento {
    private final String nome;
    private final String data;
    private final Ingresso ingressoNormal;
    private final IngressoVIP ingressoVIP;

    public Evento(String nome, String data, Ingresso ingressoNormal, IngressoVIP ingressoVIP) {
        this.nome = nome;
        this.data = data;
        this.ingressoNormal = ingressoNormal;
        this.ingressoVIP = ingressoVIP;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Ingresso getIngressoNormal() {
        return ingressoNormal;
    }

    public IngressoVIP getIngressoVIP() {
        return ingressoVIP;
    }
}
