🏠 **Casa Inteligente (Smart Home) - IoT (Módulo 6)**

Bem-vindo(a) ao repositório oficial do Módulo 6 da disciplina de Padrões de Projetos de Software.

📜 **O Contexto (A Sua Missão)**

Você foi contratado(a) por uma startup de automação residencial (Smart Home). O aplicativo deles permite que os usuários controlem TVs, lâmpadas e câmeras de segurança pelo celular. No entanto, o código atual virou uma "teia de aranha" de dependências diretas e inseguras.

🚨 **Os Sintomas (O que você vai consertar):**

Explosão de Controles (Herança Frágil): Para cada nova marca de TV, a equipe precisa criar duas classes novas de controle remoto.

Falta de Segurança e Lentidão: A câmera de segurança carrega o vídeo pesadíssimo na memória assim que o aplicativo abre, consumindo dados do usuário, e não exige nenhuma senha para ser acessada.

Ações Irreversíveis: O botão de ligar a luz chama o método diretamente. Não existe um botão de "Desfazer", e não conseguimos criar um histórico de ações do usuário.

Sensores "Deuses": O sensor de fumaça está instanciando diretamente o Alarme e os Sprinklers de água. Se instalarmos uma porta automática na casa, teremos que abrir e alterar a classe do Sensor de Fumaça!

A sua missão é "organizar a casa" aplicando os Padrões Estruturais e Comportamentais (GoF) para criar camadas de segurança, separar abstrações e orquestrar eventos.

🛠️ **Como iniciar o laboratório**

Abra o IntelliJ IDEA.

Na tela de boas-vindas, clique em Get from VCS.

Cole a URL deste repositório:

[https://github.com/prof-salu/java-smart-home-legado.git](https://github.com/prof-salu/java-smart-home-legado.git)


Clique em Clone e em seguida Trust Project.

No painel de projeto à esquerda, expanda a pasta azul src e abra o arquivo Main.java para ver a bagunça de acoplamento rodando no console.

🎯 **Laboratórios de Refatoração**

Siga a sua Apostila de Laboratório para aplicar as correções abaixo:

**1. O Controle Universal (Bridge)**

Objetivo: Separar a Abstração (Os Controles) da Implementação (As TVs e Rádios) para que possamos criar um controle que sirva em qualquer marca.

Ação: Criar a interface Dispositivo e fazer a classe base ControleRemoto apontar para essa interface, atuando como uma ponte.

**2. O Olho Que Tudo Vê (Proxy)**

Objetivo: Atrasar a criação da câmera pesada e adicionar uma barreira de proteção (Senha).

Ação: Criar um ProxyCamera que possui a mesma interface da câmera real, mas que exige a validação de uma senha antes de liberar o fluxo de vídeo.

**3. O Botão de Arrependimento (Command)**

Objetivo: Permitir que as ações da casa sejam guardadas num histórico e possam ser revertidas (Undo).

Ação: Encapsular a ação de "Ligar a Luz" numa classe ComandoLigarLuz. O aplicativo apenas executará este objeto, podendo guardá-lo numa lista para desfazê-lo no futuro.

**4. O Caos dos Sensores (Mediator)**

Objetivo: Impedir que o sensor de fumaça fale diretamente com o alarme e com os sprinklers.

Ação: Criar uma CentralInteligente (Mediador). O sensor apenas avisa a central, e a central (que conhece a casa toda) orquestra a resposta de emergência.

⚠️ **Regra de Ouro do Repositório**

Existe uma branch neste repositório chamada solucao que contém o código perfeitamente refatorado.

NÃO MUDE PARA A BRANCH SOLUÇÃO ANTES DE TENTAR! Utilize a teoria da sua apostila para tentar resolver o problema com as próprias mãos. A Arquitetura de Software se aprende resolvendo quebra-cabeças! 🚀
