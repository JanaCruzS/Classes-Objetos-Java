Aula 02 - Curso Java Poo -  Prof Gustavo Guanabara

# Caneta - Exemplo em Java
Este projeto é uma introdução prática ao encapsulamento e à manipulação de objetos em Java. Ele mostra como usar modificadores de acesso, métodos acessores e construtores para criar e gerenciar objetos de forma segura e eficiente.
Usando exemplo simples em Java que demonstra o uso da classe **Caneta** para simular o comportamento de uma caneta. A classe **Main** é usada para criar uma instância da caneta, configurar seus atributos e executar métodos que exibem seu estado e funcionalidades.

## Funcionalidades

1. **Definição de Atributos**
   - Modelo da caneta.
   - Cor da caneta.
   - Ponta (privada para garantir segurança).
   - Carga restante.
   - Estado (tampada ou destampada).

2. **Métodos**
   - `tampar()` e `destampar()`: Alteram o estado da caneta.
   - `status()`: Exibe as informações atuais da caneta.
   - Métodos acessores (`get` e `set`) garantem acesso controlado aos atributos privados.

## Código Principal (`Main`)

O código principal realiza as seguintes ações:
1. Cria uma nova caneta com atributos iniciais.
2. Modifica os atributos públicos diretamente (como `modelo` e `cor`).
3. Chama métodos para alterar o estado da caneta (exemplo: destampar).
4. Exibe as informações da caneta usando o método `status()`.


