public class ProxyCameraSeguranca implements Camera {
    private CameraDeSeguranca cameraReal; // Lazy Load (só instancia quando precisar)
    private String senha;

    public ProxyCameraSeguranca(String senha) {
        this.senha = senha;
    }

    @Override
    public void verVideo() {
        if (senha.equals("1234")) {
            if (cameraReal == null) {
                cameraReal = new CameraDeSeguranca(); // Instancia apenas se a senha estiver certa!
            }
            cameraReal.verVideo();
        } else {
            System.out.println("ACESSO NEGADO: Senha incorreta para acessar a câmera.");
        }
    }
}