public class ControleRemoto {
    private boolean ligado;
    private int volume;
    private int canal;
    private boolean mute;

    
    public ControleRemoto() {
        this.ligado = false;
        this.volume = 10; // Volume inicial
        this.canal = 1;   // Canal inicial
        this.mute = false; // Mute desativado por padrão
    }

    
    public void ligar() {
        this.ligado = true;
        System.out.println("TV ligada.");
    }

    
    public void desligar() {
        this.ligado = false;
        System.out.println("TV desligada.");
    }

    
    public void aumentarVolume() {
        if (ligado) {
            if (!mute) {
                volume += 1;
                System.out.println("Volume aumentado para " + volume + ".");
            } else {
                System.out.println("A TV está no modo Mute. Desative o Mute para ajustar o volume.");
            }
        } else {
            System.out.println("TV está desligada. Não é possível ajustar o volume.");
        }
    }

    
    public void diminuirVolume() {
        if (ligado) {
            if (!mute) {
                if (volume > 0) {
                    volume -= 1;
                    System.out.println("Volume diminuído para " + volume + ".");
                } else {
                    System.out.println("Volume já está no mínimo.");
                }
            } else {
                System.out.println("A TV está no modo Mute. Desative o Mute para ajustar o volume.");
            }
        } else {
            System.out.println("TV está desligada. Não é possível ajustar o volume.");
        }
    }

    
    public void mudarCanal(int novoCanal) {
        if (ligado) {
            this.canal = novoCanal;
            System.out.println("Canal mudado para " + canal + ".");
        } else {
            System.out.println("TV está desligada. Não é possível mudar o canal.");
        }
    }

    
    public void canalMais() {
        if (ligado) {
            canal += 1;
            System.out.println("Canal aumentado para " + canal + ".");
        } else {
            System.out.println("TV está desligada. Não é possível mudar o canal.");
        }
    }
    
    public void canalMenos() {
        if (ligado) {
            if (canal > 1) {
                canal -= 1;
                System.out.println("Canal diminuído para " + canal + ".");
            } else {
                System.out.println("Já está no canal mínimo.");
            }
        } else {
            System.out.println("TV está desligada. Não é possível mudar o canal.");
        }
    }

    
    public void consultarStatus() {
        if (ligado) {
            String status = "Volume: " + volume + ", Canal: " + canal + ", Mute: " + (mute ? "Ativado" : "Desativado");
            System.out.println(status);
        } else {
            System.out.println("TV está desligada.");
        }
    }

    
    public void ativarMute() {
        if (ligado) {
            this.mute = true;
            System.out.println("Função Mute ativada.");
        } else {
            System.out.println("TV está desligada. Não é possível ativar o Mute.");
        }
    }

    
    public void desativarMute() {
        if (ligado) {
            this.mute = false;
            System.out.println("Função Mute desativada.");
        } else {
            System.out.println("TV está desligada. Não é possível desativar o Mute.");
        }
    }


    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.aumentarVolume();
        controle.canalMais();
        controle.consultarStatus();
        controle.ativarMute();
        controle.aumentarVolume();  // Não funcionará, pois está em Mute
        controle.desativarMute();
        controle.aumentarVolume();
        controle.consultarStatus();
        controle.desligar();
    }
}
