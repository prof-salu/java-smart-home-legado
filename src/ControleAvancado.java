public class ControleAvancado extends ControleRemoto {
    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void botaoLigar() {
        dispositivo.ligar();
    }
    public void botaoDesligar() {
        dispositivo.desligar();
    }
    public void botaoMudo() {
        dispositivo.mutar();
    }
}