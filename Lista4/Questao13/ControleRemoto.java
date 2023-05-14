package Questao13;

public class ControleRemoto {

	private boolean ligado;
    private int volume;
    private int canal;

    public ControleRemoto() {
        ligado = false;
        volume = 0;
        canal = 1;
    }

    public void ligar() {
        ligado = true;
        System.out.println("A TV está ligada.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("A TV está desligada.");
    }

    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume:" + volume);
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }

    public void diminuirVolume() {
        if (ligado) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("O volume está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }

    public void aumentarCanal() {
        if (ligado) {
            canal++;
            System.out.println("Canal:" + canal);
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }

    public void diminuirCanal() {
        if (ligado) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal: " + canal);
            } else {
                System.out.println("Você está no primeiro canal.");
            }
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado) {
            if (novoCanal >= 1 && novoCanal <= 100) {
                canal = novoCanal;
                System.out.println("Canal trocado para " + canal);
            } else {
                System.out.println("Canal inválido. Insira um número de canal válido (entre 1 e 100).");
            }
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }

    public void mute() {
        if (ligado) {
            volume = 0;
            System.out.println("Mudo ativado");
        } else {
            System.out.println("A TV está desligada. Ligue a TV primeiro.");
        }
    }
}

