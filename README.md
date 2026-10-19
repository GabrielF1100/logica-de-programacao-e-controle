# 🧠 Lógica de Programação e Estruturas de Controle em Java

> *"Saber a sintaxe de uma linguagem permite escrever comandos; dominar as estruturas de controle e a lógica permite resolver problemas reais com engenharia."*

Este repositório reúne os conceitos, projetos de aula e exercícios práticos desenvolvidos durante o curso **Estruturas de Controle em Java**, parte do **Bootcamp Itaú - Java com Inteligência Artificial** na plataforma [DIO](https://dio.me).

---

## 🎯 A Importância deste Curso e dos Exercícios Práticos

No desenvolvimento de software moderno — onde frameworks de alta produtividade (como Spring Boot) e ferramentas de Inteligência Artificial aceleram a escrita de código —, é muito fácil cair na tentação de negligenciar as estruturas de controle básicas.

No entanto, **todo sistema de software em produção é essencialmente uma malha de decisões, repetições e tratamentos de cenários imprevistos**:

1. **A Arte da Tomada de Decisão (`if/else`, `ternário`, `switch`):**
   A qualidade de uma regra de negócio depende de saber expressar condições com clareza. O uso intencional de condicionais encadeadas, o operador ternário para expressões concisas e o poder do *fall-through* em `switch-case` são ferramentas para manter o código limpo (*Clean Code*) e evitar complexidade ciclomática desnecessária.

2. **Eficiência e Controle de Fluxo (`for`, `while`, `do-while`, `break`, `continue`):**
   Processar grandes volumes de dados sem loops infinitos ou desperdício de memória exige conhecer a diferença entre verificação prévia (`while`) e posterior (`do-while`), além de saber quando iterar com segurança em arrays e coleções (`for-each`).

3. **Resiliência e Tolerância a Falhas (`try/catch/finally` e Exceções de Negócio):**
   Aplicações profissionais não podem travar na frente do usuário. O tratamento seguro de exceções (`InputMismatchException`) e a criação de exceções customizadas checadas (`CepInvalidoException`) transformam erros abruptos em mensagens de negócio claras.

4. **A Força da Prática Deliberada:**
   Os exercícios extras (como cálculo de IMC com validação rigorosa, geração de tabuadas, iteração com ordem decrescente e controle de fluxo com critérios de parada via operador resto `%`) consolidam o raciocínio algorítmico, tornando a lógica uma segunda natureza para desafios maiores de backend.

---

## 📂 Estrutura do Repositório

```text
├── 01-estruturas-condicionais/
│   ├── CaixaEletronico.java          (Condicional simples e composta com saldo dinâmico)
│   ├── ResultadoEscolar.java         (Encadeamento if/else if/else e operador ternário)
│   └── SistemaMedidaSwitch.java      (Switch-case com break e efeito fall-through intencional)
│
├── 02-estruturas-de-repeticao/
│   ├── ExemploFor.java               (Laço for clássico iterativo)
│   ├── ExemploForArray.java          (For tradicional indexado vs for-each)
│   ├── ExemploBreakContinue.java     (Interrupção com break e salto com continue)
│   └── ExemploWhileDoWhile.java      (Comparações práticas entre while e do-while)
│
├── 03-tratamento-de-excecoes/
│   ├── AboutMeTratamentoExcecao.java (Leitura blindada com try-catch-finally)
│   ├── CepInvalidoException.java     (Criação de Checked Exception customizada)
│   └── FormatadorCepExemplo.java     (Disparo e propagação com throw e throws)
│
└── exercicios extras/
    ├── Exercicio01Tabuada.java                     (Tabuada dinâmica de 1 a 10)
    ├── Exercicio02CalculoIMC.java                  (Cálculo e classificação de IMC oficial)
    ├── Exercicio03FiltroIntervaloDecrescente.java  (Intervalo validado e ordem decrescente)
    └── Exercicio04MultiplosComParada.java          (Critério de parada via resto % e continue)
```

---

## 🛠️ Tecnologias Utilizadas
- **Java 21 LTS** (OpenJDK 21)
- **Leitura dinâmica:** `java.util.Scanner`
- **Validações de tipos:** `java.util.InputMismatchException`
- **Controle de versão:** Git & GitHub via SSH

---
👨‍💻 Desenvolvido por **[Gabriel Felippe Baptista](https://github.com/GabrielF1100)** durante o Bootcamp da DIO.
