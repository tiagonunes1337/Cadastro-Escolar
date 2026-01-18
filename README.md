# Sistema de Gestão Acadêmica - Java Programação Orientada a Objetos (POO) 🎓

Este é um projeto desenvolvido em **Java** para consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)** e **Engenharia de Software**. O sistema permite o cadastro de professores e alunos, realizando validações de regras de negócio em múltiplas camadas.
Além que é um sistema que foi criado na época que eu estava estudando na Escola Técnica de Brasília (ETB) em Abril de 2025.
## 🚀 Funcionalidades

- **Cadastro de Professor**: Validação de idade mínima (18 anos) e piso salarial (R$ 2.000,00).
- **Cadastro de Alunos**: Loop de repetição para múltiplos cadastros com armazenamento em memória.
- **Validação de Notas**: Filtro para garantir notas apenas no intervalo de 0 a 10.
- **Relatório Inteligente**: Ao finalizar, o sistema gera um relatório separado por status:
  - ✅ Aprovados
  - 🟡 Recuperação
  - ❌ Reprovados

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem**: Java 8+
- **Ambiente de Desenvolvimento Integrado**: NetBeans 8.2
- **Bibliotecas**: [Lombok](https://projectlombok.org/) (para produtividade com Getters e Setters).
- **Conceitos de Programação Orientada a Objetos para Engenharia de Software**:
  - **Encapsulamento**: Atributos privados com validação nos métodos Setters.
  - **Herança**: Uso de uma classe base `Pessoa` para `Aluno` e `Professor`.
  - **Coleções**: Uso de `ArrayList` para persistência de dados em tempo de execução.
  - **Robustez**: Tratamento de buffer de teclado e validações com `do-while`.

## 💻 Como Rodar o Projeto (Ambiente Linux/Windows)

1. Certifique-se de ter o JDK instalado.
2. Clone o repositório:
   ```bash
   git clone https://github.com/tiagonunes1337/Cadastro-Escolar.git
```
3. Abra o projeto no seu NetBeans ou IntelliJ.

Execute a classe Teste.java.

- **Nota**: O sistema utiliza o Locale US, portanto, utilize o ponto . como separador decimal (ex: 7.5).

##📌 Próximos Passos
- [ ] Implementar persistência de dados em banco de dados SQL.

- [ ] Criar uma API Backend utilizando Spring Boot.

- [ ] Adicionar testes unitários para as regras de negócio.

Desenvolvido por Tiago de Aquino Nunes, como parte dos estudos de Engenharia de Software na Universidade Católica de Brasília.
