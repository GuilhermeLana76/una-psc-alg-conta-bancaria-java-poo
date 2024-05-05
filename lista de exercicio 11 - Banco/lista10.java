import BancoPOO.banco;
import java.util.Scanner;

public class lista10 {
    public static void main(String[] args) {
        BancoPOO.banco banco = new banco(null, 0, null);
        Scanner scanner = new Scanner(System.in);

            //CRIANDO A CONTA
            System.out.println("Bem vindo a Conta Bancária em Java - POO");

            System.out.println("Favor ensira seu nome: ");
                String nome = scanner.nextLine();
                banco.setNome(nome);

            System.out.println("Favor ensira o número da conta: ");
                int conta = scanner.nextInt();
                banco.setConta(conta);

            System.out.println("Favor ensira seu saldo: ");
                Double saldo = scanner.nextDouble();
                banco.setSaldo(saldo);

            System.out.println("Conta criada com sucesso!");

            //AÇÕES DA CONTA

            int escolha;
            do {
                System.out.println("Qual ação deseja utilizar?");
                System.out.println("1 - Depositar valor");
                System.out.println("2 - Sacar valor");
                System.out.println("3 - Consultar saldo");
                System.out.println("0 - encerrar progama");
                escolha = scanner.nextInt();

                if (escolha == 0) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                switch (escolha) {

                    case 1:
                        System.out.println("Ensira o valor que deseja depositar: ");
                        Double deposito = scanner.nextDouble();
                        banco.setDepositar(deposito);
                        break;

                    case 2:
                        System.out.println("Ensira o valor que deseja sacar: ");
                        Double saque = scanner.nextDouble();
                        banco.setSacar(saque);
                        break;

                    case 3:
                        banco.setConsulta();
                        break;

                }
            } while (escolha != 0);


        scanner.close();
    }
}