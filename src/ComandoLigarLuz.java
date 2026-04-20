public class ComandoLigarLuz implements Comando {
    private Lampada lampada;

    public ComandoLigarLuz(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        lampada.ligar();
    }
    public void desfazer() {
        lampada.desligar();
    }
}