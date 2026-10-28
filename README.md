# Projeto FiapRide Celular - Bryan de Almeida

## Informações do Aluno

- **Nome:** Bryan de Almeida
- **RM:** [Coloque seu RM aqui]
- **Turma:** [Coloque sua Turma aqui]
- **Curso:** [Coloque seu Curso aqui]
- **GitHub:** [@seu-usuario](https://github.com/seu-usuario)

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos. Embora o tema central da disciplina tenha sido o sistema de mobilidade FiapRide, eu decidi aplicar os conceitos evoluindo um sistema de **Smartphone/Celular**, criando um projeto incremental onde cada pasta (Aula 2 a Aula 9) representa o avanço técnico e conceitual aprendido em sala.

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos (Introdução)
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos
**Pergunta:** "Por que precisamos criar uma classe? Não seria mais fácil apenas criar variáveis soltas no main? Pense: E se o sistema tiver 1 milhão de usuários?"
**Sua Resposta:** Criar variáveis soltas no `main` funciona para testes pequenos, mas é insustentável em sistemas reais. Se tivermos 1 milhão de celulares em um sistema de estoque, criar `String modelo1 = "iPhone"; int memoria1 = 128;` para cada um seria um caos. A Classe é o "molde" que nos permite criar um tipo de dado próprio (como `Celular`) e, a partir dele, instanciar 1 milhão de objetos na memória de forma organizada, agrupando as características (atributos) de cada aparelho.

### Aula 2 - Métodos
**Pergunta:** "Se podemos simplesmente fazer `celular.armazenamento = celular.armazenamento + 10` diretamente no código principal, por que criar um método específico como `instalarApp(valor)`? Quais são os riscos?"
**Sua Resposta:** A alteração direta ignora as regras de negócio. Se o celular tem 128GB e o usuário tenta instalar um app de 200GB, a alteração direta quebraria o sistema (armazenamento negativo ou estourado). O método `instalarApp()` cria uma barreira de segurança, permitindo que o programador coloque um `if` para verificar se há espaço suficiente antes de alterar o estado do objeto.

### Aula 3 - Encapsulamento
**Pergunta:** "No nosso código, os atributos são private, mas os métodos getSaldo() e getNome() são public. Por que é seguro deixar o get público, mas perigoso deixar o atributo original público?"
**Sua Resposta:** O `get` (Getter) entrega apenas uma **cópia** do valor (uma leitura). É como dar a alguém uma fotocópia do seu documento. Já o atributo público entrega o **original**. No nosso projeto do Celular, se o `armazenamentoUsado` fosse público, qualquer classe poderia fazer `celular.armazenamentoUsado = 5000` e quebrar o objeto. Com o atributo `private`, só a própria classe Celular pode alterá-lo, usando o `setArmazenamentoUsado` privado que contém as validações lógicas.

### Aula 4 - Construtores
**Pergunta:** "Por que é um erro gerar Getters e Setters para tudo? Como a ausência do setModelo() protege o sistema?"
**Sua Resposta:** No mundo real, o modelo de um celular é imutável (um Galaxy S23 não se transforma em um iPhone). Criar um `setModelo()` permitiria que um erro de software alterasse a identidade do objeto. Além disso, o Construtor obriga que o objeto nasça completo (com modelo e capacidade), eliminando os "objetos fantasmas" (em branco) que causariam erros graves de memória (NullPointerException).

### Aula 5 - Associação
**Pergunta:** "No construtor da Viagem, exigimos o objeto inteiro (Passageiro). Não seria mais fácil pedir apenas a String do nome?"
**Sua Resposta:** Não, porque uma associação (TEM-UM) não é apenas sobre mostrar texto, é sobre **conectar comportamentos**. Se a nossa classe `Celular` recebesse apenas o texto "Bateria 5000mAh" em vez do objeto `Bateria`, o celular não conseguiria chamar o método `bateria.setNivelCarga()`. Ao passar o objeto inteiro, o celular consegue interagir com a bateria real, alterando o seu estado.

### Aula 6 - Herança
**Pergunta:** "Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?"
**Sua Resposta:** Isso protege o princípio do **Encapsulamento**. Quando o `Smartphone` herda de `Dispositivo`, ele não pode simplesmente fazer `this.marca = "X"` porque a marca está trancada na mãe. Ele precisa obrigatoriamente usar o `super()` no construtor ou um método `setMarca()` público. Isso evita que a classe filha burle as regras de segurança que a classe mãe possa ter estabelecido.

### Aula 7 - Polimorfismo
**Pergunta:** "No loop `for (Dispositivo d : lista)`, se esquecêssemos de criar o método `calcularConsumoEnergia()` na classe mãe, conseguiríamos chamá-lo?"
**Sua Resposta:** Não. O polimorfismo depende de um "contrato" na classe base. Se a variável é do tipo `Dispositivo`, o Java só permite chamar métodos que existem na classe `Dispositivo`. Se o método não estiver lá na mãe (mesmo que exista na filha), o compilador dará erro. O contrato na base da hierarquia é o que garante que todas as classes daquela árvore terão, obrigatoriamente, aquele comportamento.

### Aula 8 - Classes Abstratas
**Pergunta:** "Faz sentido existir um objeto que é APENAS 'Veículo' genérico? Por que precisamos dizer ao Java que ele é abstract?"
**Sua Resposta:** No mundo real, não existe "um veículo" ou "um dispositivo" que não seja um tipo específico (um celular ou um tablet). No código, o Java não deduz isso sozinho, por isso precisamos do `abstract` na classe `Dispositivo`. Se esquecermos o `abstract`, o risco é alguém fazer `new Dispositivo()` e criar um objeto sem forma definida, quebrando a lógica do nosso sistema e fugindo da arquitetura planejada.

### Aula 9 - Interfaces
**Pergunta:** "Por que Java permite herança simples, mas múltiplas interfaces? O que aconteceria se pudéssemos herdar de duas classes?"
**Sua Resposta:** O Java evita a "Herança Múltipla" de classes porque causa o conflito do diamante. Se `Celular` herdasse de `Dispositivo` e `Bateria` ao mesmo tempo, e ambas tivessem um método `ligar()`, o Java não saberia qual usar. As **Interfaces** resolvem isso porque não contêm código (apenas contratos). O nosso `Smartphone` pode assinar o contrato `Recarregavel` e herdar de `Dispositivo` sem conflito, pois a interface só diz "você DEVE ter o método recarregar()", mas quem escreve o código de execução é o próprio Smartphone.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)
**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Sistema de Aparelhos Eletrônicos / Smartphone.

**Quais classes você criou?**
`Celular`, `Bateria`, `Dispositivo`, `Smartphone`, `Tablet` e a Interface `Recarregavel`.

**Qual foi o maior desafio técnico que você enfrentou?**
O maior desafio foi adaptar os conceitos que o professor ensinou no contexto de veículos (Carro/Moto) para o contexto de aparelhos (Smartphone/Tablet). No começo, foi desafiador entender como a interface `Recarregavel` poderia ser aplicada sem repetir código. Outra dificuldade foi organizar os pacotes (Aula2, Aula3...) de forma que o código não ficasse confuso, mas sim que demonstrasse uma evolução clara de aprendizado em cada pasta, culminando no projeto final na Aula 9. Resolvi isso padronizando os diagramas no Astah e revisando o encapsulamento em todas as etapas.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
Aprendi que a Programação Orientada a Objetos vai muito além de criar variáveis dentro de uma classe. Compreendi a importância do encapsulamento para proteger os dados do sistema e como a herança e as interfaces ajudam a evitar repetição de código, tornando o software escalável. Entendi, na prática, que um sistema bem arquitetado nasce do planejamento, como fica evidente ao desenhar os diagramas UML no Astah.

**Qual conceito foi mais difícil de entender?**
O conceito mais difícil foi o de **Polimorfismo e Classes Abstratas**. No início, a ideia de uma classe que não pode ser instanciada e um método sem corpo parecia abstrata demais. A dificuldade foi superada ao entender que isso é um "contrato de negócios". Ao ver o método `calcularConsumoEnergia()` funcionando de forma diferente para o Celular (5%) e para o Tablet (8%), a ficha caiu de que o objetivo era padronizar a chamada, mas personalizar a execução.

**O que você melhoraria no seu projeto se pudesse refazer?**
Eu melhoraria a organização do Git. Faria commits menores com as mensagens padronizadas que o professor pediu (ex: `feat: aula4 - cria construtores`) logo no momento em que finalizei cada pasta, ao invés de fazer um commit geral no final. Também separaria as classes em pacotes mais organizados, como `model`, `service` e `main`, para deixar o código ainda mais próximo do padrão de mercado.
