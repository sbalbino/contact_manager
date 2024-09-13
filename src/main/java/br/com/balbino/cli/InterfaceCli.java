package br.com.balbino.cli;

public class InterfaceCli {
    private final InterfaceService interfaceService = new InterfaceService();

    public void iniciarSistema() {
        Integer option;
        do {
            InterfaceTemplate.menuPrincipal();
            option = this.interfaceService.capturaOpcaoNumerica();
            option = option == null ? -1 : option;

            switch (option) {
                case 1:
                    this.interfaceService.adicionarContato();
                    break;
                case 2:
                    this.interfaceService.buscarContato();
                    break;

                case 3:
                    this.interfaceService.removerContato();
                    break;

                case 4:
                    this.interfaceService.listarContatos();
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Escolha entre as opções do menu.");
                    this.interfaceService.pause();
            }
        } while (option != 0 );
    }
}
