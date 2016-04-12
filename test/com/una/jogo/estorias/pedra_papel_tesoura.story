Story: Jogo do Pedra Papel Tesoura 
Como jogador gostaria de fazer uma disputa de pedra papel e tesoura
para vencer meu openente.

Scenario: Generico de pedra papel e tesoura
Given que a primeira jogada for <primeiraJogada> 
When a segunda jogada for <segundaJogada>
Then exibe a seguinte mensagem <mensagem>


Examples:
|primeiraJogada|segundaJogada|mensagem|
|tesoura|papel|tesoura corta papel|
|pedra|tesoura|pedra quebra tesoura|