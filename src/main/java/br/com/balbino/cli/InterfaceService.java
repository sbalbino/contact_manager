package br.com.balbino.cli;

import br.com.balbino.model.Contact;
import br.com.balbino.model.ContactList;

import java.util.Scanner;

public class InterfaceService {
    private final Scanner scanner = new Scanner(System.in);
    private final ContactList contactList = new ContactList();
    private final String REGEX_NUMEROS = "\\d+";

    public Integer capturaOpcaoNumerica() {
        System.out.print("Opção: ");
        String entrada = scanner.nextLine();
        if (entrada.matches(REGEX_NUMEROS)) {
            return Integer.parseInt(entrada);
        }
        System.out.print("Opção inválida, selecione uma opção numérica.");
        return null;
    }

    public void adicionarContato() {
        InterfaceTemplate.adicionarContato();

        String nome;
        boolean nomeValido;
        do {
            nomeValido = true;
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            if (nome.isEmpty() || nome.isBlank()) {
                nomeValido = false;
                System.out.println("O nome não pode estar vazio.");
                pause();
            }
        } while (!nomeValido);

        String telefone;
        boolean telefoneValido;
        do {
            telefoneValido = true;
            System.out.print("Telefone: ");
            telefone = scanner.nextLine();

            if (telefone.isEmpty() || telefone.isBlank()) {
                telefoneValido = false;
                System.out.print("Preencha o telefone!");
                pause();
            } else if (!telefone.matches(REGEX_NUMEROS)) {
                telefoneValido = false;
                System.out.print("Digite apenas números!");
                pause();
            } else if (telefone.length() < 9 || telefone.length() > 11) {
                telefoneValido = false;
                System.out.print("O telefone deve conter entre 9 e 11 dígitos!");
                pause();
            }
        } while (!telefoneValido);

        String email;
        boolean emailValido;
        do {
            emailValido = true;
            System.out.print("Email: ");
            email = scanner.nextLine();
            if (email.isEmpty() || email.isBlank()) {
                emailValido = false;
                System.out.print("Preencha o e-mail.");
                pause();
            } else if (!email.contains("@")) {
                emailValido = false;
                System.out.print("E-mail não possui @. Adicione um e-mail válido.");
                pause();
            }
        } while (!emailValido);

        this.contactList.addContact(new Contact(nome, email, telefone));
        pause();
    }

    public void removerContato() {
        InterfaceTemplate.removerContato();
        String nameOrNumber;
        boolean nomeValido;
        do {
            nomeValido = true;
            System.out.print("Nome/Número a ser removido: ");
            nameOrNumber = scanner.nextLine();
            if (nameOrNumber.isEmpty() || nameOrNumber.isBlank()) {
                nomeValido = false;
                System.out.print("Insira um nome ou número validos!\n");
            }
        } while (!nomeValido);
        this.contactList.removeContact(nameOrNumber);
        pause();
    }

    public void listarContatos() {
        InterfaceTemplate.listarContatos();
        this.contactList.listContacts();
        pause();
    }

    public void pause() {
        System.out.println("\nTecle ENTER para continuar.");
        scanner.nextLine();
    }

    public void buscarContato() {
        InterfaceTemplate.buscarContato();
        String busca;
        boolean buscaValida;
        do {
            buscaValida = true;
            System.out.print("\nNome/Número a ser buscado: ");
            busca = scanner.nextLine();

            if (busca.isEmpty()) {
                buscaValida = false;
                System.out.print("Insira um nome ou número válido!");
                pause();
            }
        } while (!buscaValida);

        if (!this.contactList.searchContact(busca)) {
            System.out.print("Nenhum resultado encontrado!\n");
        }
        pause();
    }
}
