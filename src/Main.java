public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SMART HOME (CÓDIGO LEGADO) ===\n");

        System.out.println("--- 1. Problema de Controles ---");
        ControleAvancadoTV_LG controle = new ControleAvancadoTV_LG();
        controle.ligar();
        controle.mutar();
        System.out.println();

        System.out.println("--- 2. Problema da Câmera (Insegura e Lenta) ---");
        // O aplicativo trava ao instanciar, antes mesmo do usuário querer ver o vídeo.
        CameraDeSeguranca camera = new CameraDeSeguranca();
        camera.verVideo(); // Qualquer pessoa pode chamar isso sem senha!
        System.out.println();

        System.out.println("--- 3. Problema da Ação Direta (Sem Undo) ---");
        Lampada luz = new Lampada();
        luz.ligar();
        // Oops! Liguei sem querer. Como o sistema sabe como desfazer o que acabei de fazer?
        System.out.println();

        System.out.println("--- 4. Problema do Acoplamento de Sensores ---");
        SensorFumaca sensor = new SensorFumaca();
        sensor.detectarFumaca(); // O sensor coordena a casa toda sozinho!
    }
}