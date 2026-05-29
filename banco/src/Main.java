import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("-------Bem-Vindo-ao-Banco-Blaster-------\n");
    System.out.println("Para cadastrar digite 1");
    System.out.println("para fazer login digite 2");
    System.out.println("Para sair digite 0");
    String acao = scanner.nextLine();



    switch (acao) {
        case "0":
            System.out.println("Você saiu do app.");
        break;
        case "1":
            System.out.println("vamos cadastrar:");
            System.out.println("Insira seu CPF");
                String cpfCadastrado = scanner.nextLine();
                        while (cpfCadastrado.length() != 11) {
                            System.out.println("CPF inexistente, tente novamente");
                            cpfCadastrado = scanner.nextLine();
                        }
            System.out.println("Digite uma Senha");
                String senhaCadastrada = scanner.nextLine();
                        while (senhaCadastrada.length() != 8) {
                            System.out.println("senha invalida, tente novamente");
                            senhaCadastrada = scanner.nextLine();
                        }
            System.out.println("Conta Cadastrada com sucesso!");
        break;
        case "2":
            System.out.println("Digite seu CPF:");
            cpfCadastrado = scanner.nextLine();
            while (cpfCadastrado.length() != 11) {
                System.out.println("CPF inexistente, tente novamente");
                cpfCadastrado = scanner.nextLine();
            }
            System.out.println("digite sua senha:");
            senhaCadastrada = scanner.nextLine();
            while (senhaCadastrada.length() != 8) {
                System.out.println("senha invalida, tente novamente");
                senhaCadastrada = scanner.nextLine();
            }
            break;
        default:
            System.out.println("ação invalida, tente novamente");
            break;
    }

    boolean logado = true;

    while (logado) {
        System.out.println("1- Ver saldo");
        System.out.println("2- Fazer Transferência");
        System.out.println("3- Depositar");
        System.out.println("4- Sacar");
        System.out.println("5- Extrato");
        System.out.println("6- logout");

        String opcao = scanner.nextLine();
        double saldo = 0;
        String[] contatos = new String[5];
        contatos[0] = "mãe";
        contatos[1] = "pai";

        switch (opcao) {
            case "1":
                System.out.println("Seu saldo é " + saldo);
            break;
            case "2":
                System.out.println("Deseja transferir para quem: ");
                contatos[] = scanner.nextLine();
                System.out.println("Deseja transferir qual quantia:");

        }
    }
}
