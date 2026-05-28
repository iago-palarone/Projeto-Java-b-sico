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
                String cpfC = scanner.nextLine();
                        while (cpfC.length() != 11) {
                            System.out.println("CPF inexistente, tente novamente");
                            cpfC = scanner.nextLine();
                        }
            System.out.println("Digite uma Senha");
                String senhaC = scanner.nextLine();
                        while (senhaC.length() != 8) {
                            System.out.println("senha invalida, tente novamente");
                            senhaC = scanner.nextLine();
                        }
            System.out.println("Conta Cadastrada com sucesso!");
        break;
        case "2":
            System.out.println("Digite seu CPF:");
            while (cpfC.length() != 11) {
                System.out.println("CPF inexistente, tente novamente");
                cpfC = scanner.nextLine();
            }
            System.out.println("digite sua senha:");
            while (senhaC.length() != 8) {
                System.out.println("senha invalida, tente novamente");
                senhaC = scanner.nextLine();
            }
            break;
        default:
            System.out.println("ação invalida, tente novamente");
            break;
    }

    if ()
}
