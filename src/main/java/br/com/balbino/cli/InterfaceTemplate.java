package br.com.balbino.cli;

public class InterfaceTemplate {
    public static final String SEM_CONTATOS = "Sem contatos cadastrados!";

    public static void cabecalho(String titulo) {
        System.out.print("\n/////////////////////////     " + titulo + "\n");
    }

    public static void menuPrincipal() {
        cabecalho("MENU");
        System.out.print("""
                
                Digite uma das seguintes opções para prosseguir.
                
                1 - Adicionar Contatos
                2 - Buscar Contatos
                3 - Remover Contatos
                4 - Listar Contatos
                
                0 - Sair
                
                """);
    }

    public static void adicionarContato() {
        cabecalho("ADICIONAR CONTATO");
        System.out.print("Insira os dados para cadastro do usuário.\n");
    }

    public static void buscarContato() {
        cabecalho("BUSCAR CONTATO");
        System.out.print("\nInsira o nome ou número de telefone para buscar um contato.");
    }

    public static void listarContatos() {
        cabecalho("LISTA DE CONTATOS\n");
    }

    public static void removerContato() {
        cabecalho("REMOVER CONTATO\n");
        System.out.print("Digite um nome ou número para ser removido da lista.\n");
    }
}

