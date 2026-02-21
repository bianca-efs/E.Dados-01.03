Exercício de introdução às Estruturas de Dados — Função Recursiva (Fatorial)

Enunciado:
Crie uma função recursiva que exiba o resultado do fatorial de um número.
Pela limitação da recursividade, o número de entrada deverá ser baixo para não ocorrer estouro de pilha (StackOverflowError).
Limite de entrada: 12.

O código deve conter comentários explicando:
* A condição de parada
* Como escrever a função para o termo n em função do termo anterior

Implementar:
1. Uma função para validar a entrada do usuário (número entre 0 e 12).
2. Uma função recursiva para calcular o fatorial.
3. Comentários explicando a lógica da recursão conforme solicitado no enunciado.

Conceitos Trabalhados

* Recursividade
* Condição de parada
* Definição de termo em função do anterior
* Validação de entrada
* Limitações de tipos primitivos em Java


Conceito Matemático
O fatorial de um número natural é definido como:
n! = n × (n − 1)!

Condição de parada:
0! = 1
1! = 1
A definição recursiva indica que o valor de n depende do cálculo do termo anterior (n − 1).


Observação Técnica
O tipo "int" suporta valores até 2.147.483.647.
O maior fatorial que pode ser armazenado em um `int` é: 12! = 479001600
Valores acima disso causam overflow, por isso o limite foi definido como 12.
