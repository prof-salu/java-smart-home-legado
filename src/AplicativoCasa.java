import java.util.Stack;

public class AplicativoCasa {
    private Stack<Comando> historico = new Stack<>();

    public void executarComando(Comando comando) {
        comando.executar();
        historico.push(comando); // Guarda o objeto no histórico
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            Comando ultimo = historico.pop();
            ultimo.desfazer(); // Chama o Ctrl+Z dinamicamente
        } else {
            System.out.println("Não há nada para desfazer.");
        }
    }
}