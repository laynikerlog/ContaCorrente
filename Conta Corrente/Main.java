import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente Cliente1 = new ContaCorrente("Fulano", 3000);
        ContaCorrente Cliente2 = new ContaCorrente("Ciclano", 2000);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Verificar Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Transferir");
                System.out.println("0 - Sair");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Saldo do Fulano: R$ " + Cliente1.getSaldo());
                        System.out.println("Saldo do Ciclano: R$ " + Cliente2.getSaldo());
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser depositado na Fulano: ");
                        double depositoConta1 = scanner.nextDouble();
                        Cliente1.depositar(depositoConta1);
                        break;
                    case 3:
                        System.out.print("Digite o valor a ser sacado da Conta 1: ");
                        double saqueConta1 = scanner.nextDouble();
                        Cliente1.sacar(saqueConta1);
                        break;
                    case 4:
                        System.out.print("Digite o valor a ser transferido da Conta 1 para a Ciclano: ");
                        double transferenciaConta1Cliente2 = scanner.nextDouble();
                        Cliente1.transferir(Cliente2, transferenciaConta1Cliente2);
                        break;
                    case 0:
                        System.out.println("Saindo do programa. Até mais!");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}