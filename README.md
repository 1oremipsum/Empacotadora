## Sobre o Projeto (About the project)

Este projeto simula uma empresa que trabalha com encomendas. Observe as regras de negócio a seguir.
This project simulates a company that works with orders. Observe the following business rules.

- REGRA 1 (RULE 1)
As encomendas são empacotadas por equipes compostas por no mínimo duas pessoas.
Orders are packed by teams of at least two people.

- REGRA 2 (RULE 2)
O empacotamento depende apenas do uso de fita adesiva, que será o recurso compartilhado por todas as equipes.
Packaging relies solely on the use of tape, which will be the resource shared by all teams.

- REGRA 3 (RULE 3)
Cada membro da equipe usa somente uma fita por vez.
Each team member uses only one tape at a time.

- REGRA 4 (RULE 4)
O membro da equipe, ao terminar o empacotamento, obrigatoriamente deve devolver a fita, permitindo que outra pessoa a use.
The team member, when finishing the packaging, must return the tape, allowing someone else to use it.

- REGRA 5 (RULE 5)
Uma equipe só é contemplada com as fitas se puder pegar fitas para todos os integrantes ou se puder esgotar todas as encomendas que aguardam ser empacotadas. Caso contrário, a equipe aguardará até que haja fitas suficientes disponíveis.
A team is only awarded the tapes if it can get tapes for all the members or if it can exhaust all the orders waiting to be packaged. Otherwise, the team will wait until enough tapes are available.

## Funcionalidades de cada Classe (Features of each Class)

As funcionalidades estão descritas abaixo, seguindo a ordem dos "commits" relacionados a cada versão do projeto.
The features are described below, following the order of the "commits" related to each version of
the project.

- First commit (Created ContadorSinc):
Criado a classe ContadorSinc. Essa classe foi construída pensando no uso compartilhado por diversas threads, e por isso o uso de synchronized se faz necessário. Tomemos como exemplo o método decrementar, na linha 13. A operação que esse método realiza é: "contador = contador - 1".
A ocorrência de mais de uma chamada concorrente a esse método pode levar a uma condição de corrida, e, assim, usamos synchronized para impedir isso, garantindo que somente uma execução do método ocorra ao mesmo tempo.
Created the CounterSync. This class was built with the shared use of several threads in mind, and therefore the use of synchronized is necessary. Let us take as an example the decrementar method, in line 13. The operation that this method performs is: "counter = counter - 1".
The occurrence of more than one concurrent call to this method can lead to a race condition, and so we use synchronized to prevent this by ensuring that only one execution of the method occurs at the same time.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).