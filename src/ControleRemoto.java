public abstract class ControleRemoto {
    protected Dispositivo dispositivo; // A Ponte!

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    public abstract void botaoLigar();
    public abstract void botaoDesligar();
}