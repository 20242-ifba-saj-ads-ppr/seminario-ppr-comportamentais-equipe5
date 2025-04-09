# Command 

## Intenção 

[^GAMA]
- Encapsular uma solicitação como um objeto, desta forma permitindo parametrizar
clientes com diferentes solicitações, enfileirar ou fazer o registro (log) de solicitações
e suportar operações que podem ser desfeitas.

## Tambem Conhecido como:

- Action, Transaction [^GAMMA].

- Comando, Ação, Action, Transação, Transaction [^SHEVETS]. 

## Motivação

[^K19] (Adaptado)

- Considere o cenário em que é preciso construir um tocador de musica com as funcionalidades: Tocar, Pausar, Aumentar Volume, Diminuir Volume. No entanto, nesse cenário é preciso resolver problemas de flexibilidade e manuntenção.

### Sem o Padrão Command

- Sem o uso do padrão em questão, cada ação estaria vinculada ao metodo de ação, exemplo:


  - A ação Aumentar Volume, chamaria o metodo aumentarVolume ();
  - Assim como, A ação Diminuir Volume, chamaria a ação: diminuirVolume ();
  
<figure>

@include: .src/Command/motivacao_sem_command.puml

<figcaption> Motivação sem o Command <figcaption>

</figure>

- Nesse cenário, podemos inferir que, há pouca flexibilidade, em que, se necessario modificar as ações de aumentar ou diminuir o volume, seria preciso alterar diretamente a classe TocadorDeMusica, o que aumenta o acoplamento e dificulta a manuntenção.

- Alem disso, seria complexo implementar o historico de ações para desfazer o Aumento / Diminuição da musica.

- E por fim a forte acoplaçao a implementação do Tocador induz a dificuldades de reutilização / mudancas de comportamento.

### Com o Padrão Command

- Com o uso do padrão Command podemos definir uma interface Comando que contenha o metodo principal que será implementado nas classes filhas. 

<figure>

@include: ./src/Command/motivacao_com_command.puml

<figcaption> Motivação com o Command <figcaption>

</figure>

- Com isso, basta apenas estanciar cada ação que dessa forma a implementação contida em cada classe filha, executará cada ação espefifica quando for exibir a lista de comandos armazenados. 

- Isso Garante: 

  - Desacoplamento: A ações são estabelecidas de forma declarativa - sem saber o passo a passo. Apenas é disparado os comandos. Nesse sentido, o Involker não precisa conhecer os detalhes de implementação do Receiver.
  
  - Flexibilidade: Novas funcionalides podem ser adicionadas criando novos comandos (como por exemplo, PararMusica).

  - Historico e Desfazer: Com cada ação encapsulada em um objeto, é possivel armazenar um historico dos comandos e implementar a funcionalidade em caso de recuperar um estado.

  - Reutilização: Os comandos podem ser reutilizados em diferentes contextos. 


#### Participantes

  [^K19] (adaptado)

- Command (Comando): Define uma interface para a execução dos métodos do Tocador.
  
- ConcreteCommand (TocaMusicaComando, Pausa Comando, AumentarVolumeComando, DiminuirVolumeComando): Classe que implementa Command e modela uma operação específica do Tocador.
  
- Invoker (ListaDeComandos): Classe que armazena os Commands que devem ser executados.

- Receiver (Tocador): Define os objetos que terão as chamadas aos seus métodos controladas.

- Client (TestaListaDeComandos): Instancia os Commands associando-os ao Receiver e armazena-os no Invoker.

# Referencias Bibliográficas 

[^GAMMA]: GAMMA, Erich. et al. Padrões de projetos: Soluções reutilizáveis de software orientados a objetos Bookman editora, 2009.

[^K19]: KASPCHUK, Alexandre; PLEIN, Tiago. K19 - Design Patterns em Java. São Paulo: K19 Treinamentos, 2012.

[^SHVETS]: SHVETS, Alexander. Mergulho nos Padrões de Projeto. Refactoring.Guru, 2021.

