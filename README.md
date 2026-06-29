<div align="center">

# ☕ Cafeteria Leblanc

*Um sistema de terminal de recibos! ✨*

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/POO-Concepts-B8E1DD?style=for-the-badge&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-F5C3C8?style=for-the-badge&logoColor=white)

</div>

---

## 🌸 Sobre o Projeto

Este é um projeto de estudo focado na aplicação prática de **Programação Orientada a Objetos (POO)** em Java. Inspirado em um ambiente de cafeteria, o sistema gerencia os pedidos e o faturamento do menu de forma modular e escalável.

O sistema foi refatorado de um modelo procedural simples para um design inteiramente orientado a objetos, garantindo um código limpo, de fácil manutenção e pronto para receber novas funcionalidades de forma estruturada.

## 🛠️ Arquitetura e Conceitos Aplicados

O desenvolvimento priorizou boas práticas e pilares fundamentais da Engenharia de Software:

- **Classes e Objetos:** Modelagem das entidades do mundo real (`Produto`, `Pedido`).
- **Encapsulamento:** Proteção dos dados utilizando modificadores de acesso estritos (`private`) e exposição controlada via métodos `getters`.
- **Princípio da Responsabilidade Única (SRP):** Cada classe possui uma responsabilidade bem definida.
  - A classe `Pedido` encapsula a inteligência financeira (cálculos de subtotal e recibo).
  - A classe `Produto` funciona como um molde de dados.
  - A classe `Main` cuida estritamente da interface de linha de comando (CLI) e interação com o usuário.

## 📁 Estrutura de Arquivos

O ecossistema do projeto está dividido em três componentes autônomos:

| Arquivo | Responsabilidade |
| :--- | :--- |
| `Produto.java` | Entidade base que define os atributos do item do menu (código, nome, preço). |
| `Pedido.java` | Controlador de negócios: associa um cliente ao produto, calcula valores finais e emite o recibo. |
| `Main.java` | Ponto de entrada da aplicação. Inicializa o cardápio e recebe os inputs via `Scanner`. |

---

## ☕ Menu da Cafeteria

Atualmente, a raposinha Hanari serve as seguintes opções no terminal:

1. **Café Expresso** — R$ 5,00
2. **Cappuccino** — R$ 8,50
3. **Pão de Queijo** — R$ 4,00

---

## 🚀 Como Executar Localmente

Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado no seu ambiente.

1. Clone o repositório:
   ```bash
   git clone https://github.com/RainingUXCode/leblanc-cafe-oop.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd leblanc-cafe-oop
   ```
3. Compile os arquivos Java:
   ```bash
   javac Main.java Produto.java Pedido.java
   ```
4. Inicie o sistema:
   ```bash
   java Main
   ```

---

<div align="center">

**Desenvolvido com 🤎 e muito café por [Raínne Carvalho (RainingUXCode)](https://github.com/RainingUXCode)**

</div>
