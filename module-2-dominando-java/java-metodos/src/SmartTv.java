public class SmartTv {
    boolean ligada;
    int canal;
    int volume;

    public SmartTv() {
        this.ligada = false;
        this.canal = 0;
        this.volume = 0;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    public void mudarCanal() {
        this.canal++;
    }

    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.mudarCanal(5);
        tv.mudarCanal();
        System.out.println("Ligada: " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);
    }
}
