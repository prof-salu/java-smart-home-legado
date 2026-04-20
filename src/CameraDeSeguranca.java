public class CameraDeSeguranca {
    // ERRO: O vídeo pesado é carregado na memória assim que o objeto é instanciado.
    // Pior ainda: não há verificação de senha!
    public CameraDeSeguranca() {
        System.out.println("[REDE] Conectando à Câmera IP... Carregando streaming de vídeo pesado (500MB)...");
    }

    public void verVideo() {
        System.out.println("Exibindo vídeo ao vivo da garagem...");
    }
}