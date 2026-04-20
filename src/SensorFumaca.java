public class SensorFumaca {
    private Mediador mediador;

    public SensorFumaca(Mediador mediador) {
        this.mediador = mediador;
    }

    public void detectarFumaca() {
        System.out.println("Fumaça detectada na cozinha!");
        // O sensor não sabe quem é o alarme. Ele apenas avisa a central.
        mediador.notificar("FUMACA_DETECTADA");
    }
}