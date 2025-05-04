# Simulador de Maquininha de Pagamento

Este projeto é uma simulação simples de uma **maquininha de pagamento**, feita em **Kotlin**, para realizar transações de pagamento com cartão de crédito e débito, com cálculo de taxas e geração de recibo.

## 🚀 Funcionalidades

- Cadastro de **clientes** e **comerciantes**.
- Simulação de **pagamento por cartão de crédito e débito**.
- Cálculo de **taxas de transação**.
- Geração de **recibo simulado** (exibido no terminal).
- Registro de transações no console.

## 📥 Como baixar e rodar

### 1. Requisitos

- **Kotlin** ( [aqui](https://kotlinlang.org/docs/tutorials/command-line.html)).
- **JDK 8+** (Java Development Kit).

### 2. Clonar o repositório

Abra o terminal e execute o comando para clonar o repositório:

```bash
git clone https://github.com/seu-usuario/simulador-maquininha.git
cd simulador-maquininha
```

### 3. Compilar o código

Dentro do diretório do projeto, execute o comando para compilar o código:

```bash
kotlinc models/*.kt services/*.kt utils/*.kt Main.kt -include-runtime -d simulador.jar
```

### 4. Rodar o programa 

Após a compilação, execute o programa com o seguinte comando:

```bash
java -jar simulador.jar
```

Isso iniciará o simulador e mostrará o resultado da transação no terminal.

## 📝 Explicação do código

O programa simula uma transação de pagamento com as seguintes classes principais:

- **Cliente:** Representa o cliente que realiza o pagamento.
- **Comerciante:** Representa o comerciante que recebe o pagamento.
- **TipoPagamento:** Define se o pagamento é por crédito ou débito.
- **Transacao:** Contém os detalhes da transação, incluindo valor original, taxa aplicada e valor final.
- **PagamentoService:** Serviço responsável por realizar a transação, calculando o valor com a taxa.
- **Taxas:** Classe responsável por fornecer as taxas para cada tipo de pagamento (crédito ou débito)

## 🎯 Melhorias Futuras

- Adicionar **suporte a múltiplos pagamentos**
- Criar uma interface gráfica usando **Kotlin/JavaFX**
- Implementar **registro de transações em arquivo JSON**
- Adicionar **validação de dados** (cartão de crédito, CPF, etc)

## 🤝 Contribuições

Se você quiser contribuir para este projeto, fique à vontade para abrir um Pull Request. Qualquer contribuição será bem-vinda!

## 🖋 Licença
Este projeto é de código aberto, licenciado sob a Licença MIT.
