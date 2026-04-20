public class SensorFumaca {
    // ERRO: Alto acoplamento (Teia de Aranha).
    // O sensor de fumaça conhece classes que não deveriam ser da conta dele.
    private Alarme alarme = new Alarme();
    private Sprinkler agua = new Sprinkler();

    public void detectarFumaca() {
        System.out.println("Fumaça detectada na cozinha!");
        alarme.tocar();
        agua.liberarAgua();
    }
}