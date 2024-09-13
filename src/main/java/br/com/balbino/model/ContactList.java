package br.com.balbino.model;

import br.com.balbino.cli.InterfaceTemplate;

public class ContactList {
    private Node head;

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null)
            this.head = newNode;
        else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = newNode;
        }
        System.out.println("\nContado adicionado: " + contact);
    }

    public boolean searchContact(String search) {
        search = search.toLowerCase();
        Node iterator = head;
        Node ultimo = null;
        boolean found = false;
        while ((iterator != null && iterator.next != null) || ultimo != null) {
            if (iterator.contact.getName().toLowerCase().contains(search) ||
                    iterator.contact.getPhoneNumber().contains(search)) {
                System.out.print("\n" + iterator.contact);
                found = true;
            }
            iterator = iterator.next;
        }

        System.out.println("\n");

        if (head == null) {
            System.out.println("Sem contatos cadastrados.");
            return false;
        }

        return found;
    }

    public void removeContact(String nameOrPhone) {
        nameOrPhone = nameOrPhone.toLowerCase();
        if (head == null) {
            System.out.println(InterfaceTemplate.SEM_CONTATOS);
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.contact.getName().toLowerCase().equals(nameOrPhone) ||
                    current.contact.getPhoneNumber().equals(nameOrPhone)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Removido: " + current.contact);
                return;
            }
            previous = current;
            current = current.next;
        }

        System.out.println("Contato com esses dados não foi encontrado!");
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("Sem contatos cadastrados.");
            return;
        }

        int count = 1;
        Node nodeToPrint = head;
        while (nodeToPrint.next != null) {
            System.out.print(count + " - ");
            System.out.println(nodeToPrint.contact);
            nodeToPrint = nodeToPrint.next;
            count++;
        }
        System.out.print(count + " - ");
        System.out.println(nodeToPrint.contact);
    }
}

