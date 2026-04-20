public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SMART HOME (REFATORADO) ===\n");

        System.out.println("--- 1. Bridge ---");
        Dispositivo tv = new TV_LG();
        ControleAvancado controle = new ControleAvancado(tv);
        controle.botaoLigar();
        controle.botaoMudo();
        System.out.println();

        System.out.println("--- 2. Proxy ---");
        Camera proxySeguro = new ProxyCameraSeguranca("0000");
        proxySeguro.verVideo(); // Vai negar acesso

        Camera proxyPermitido = new ProxyCameraSeguranca("1234");
        proxyPermitido.verVideo(); // Vai instanciar e liberar o vídeo
        System.out.println();

        System.out.println("--- 3. Command ---");
        AplicativoCasa app = new AplicativoCasa();
        Lampada luzSala = new Lampada();
        Comando ligarLuz = new ComandoLigarLuz(luzSala);

        app.executarComando(ligarLuz); // Liga e guarda no histórico
        app.desfazerUltimo(); // Desfaz a ação!
        System.out.println();

        System.out.println("--- 4. Mediator ---");
        Mediador central = new CentralInteligente();
        SensorFumaca sensor = new SensorFumaca(central); // Injeta o mediador
        sensor.detectarFumaca(); // A mágica acontece de forma desacoplada
    }
}