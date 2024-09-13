
# Contact Manager

Sistema projetado para gerenciar uma lista de contatos como trabalho final da matéria de Programação Orientada a Objetos

## Estrutura

O sistema foi projetado em Java com Maven

## Funcionalidades

| Opção               | Funcionalidade  |
| ----------------- | ---------------------------------------------------------------- |
| 1 | Adicionar Contato |
| 2 | Buscar Contato |
| 3 | Remover Contato |
| 4 | Listar Contatos |


# Utilização

O sistema pode ser utilizado através de inputs feitos pelo usuário, informando os dados através da navegação pelos menus

## Adicionar Contato
Para adicionar um contato, o usuário deve selecionar a opção número 1 no menu e inserir os dados como nome, número de telefone e e-mail

### Validadores
**Nome**: Não pode ser branco nem nulo

**Telefone**: Só podem ser números e entre 9 e 11 dígitos

**E-mail**: Não pode ser branco nem nulo, precisa possuir @

## Buscar Contato
A busca de contatos pode ser feita na opção de número 2 do menu
O usuário deve inserir o nome ou número de telefone no campo de busca e serão retornados todos os contatos que possuírem aquela sequência nos campos nome ou número

### Validadores
**Nome/Número**: Não pode ser nulo ou vazio

## Remover contato
A remoção de contatos pode ser feita através da opção 3 do menu
Para remover o usuário deve inserir o nome ou número de telefone do contato, que deve ser exato ao contato desejado

### Validadores
**Nome/Número**: Não pode ser nulo ou vazio

## Listar contatos
A listagem de contatos é feita na opção número 4 do menu e são exibidos todos os contatos disponíveis ou uma mensagem alertando não existir contato cadastrado

