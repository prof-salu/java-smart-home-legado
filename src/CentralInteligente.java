public class CentralInteligente implements Mediador {
    private Alarme alarme = new Alarme();
    private Sprinkler agua = new Sprinkler();

    @Override
    public void notificar(String evento) {
        if (evento.equals("FUMACA_DETECTADA")) {
            System.out.println("[CENTRAL] Orquestrando emergência...");
            alarme.tocar();
            agua.liberarAgua();
        }
    }
}