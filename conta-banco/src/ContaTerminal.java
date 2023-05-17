import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //TODO: "conhecer e importar a classe Scanner"
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        //TODO: "Exibir as mensagens para o usuario"
        System.out.println("*********************************************************");
        System.out.println("**********Seja Bem Vindo ao Banco do Jose****************");
        System.out.println("*********************************************************");
        System.out.println();

        //TODO: "Obter pela scanner os valores digitados no terminal"
        System.out.println("Por Favor entre com o seu nome completo:");
        nomeCliente = sc.nextLine();

        System.out.println("Por Favor entre com o numero da sua agência:");
        agencia = sc.nextLine();

        System.out.println("Por Favor entre com o numero da conta do banco:");
        numeroConta = sc.nextInt();

        System.out.println("Por Favor entre com o valor do primeiro depósito:");
        saldo = sc.nextDouble();

        //TODO: "Exibir a mensagem conta criada"
        System.out.println();
        System.out.println("Olá " + nomeCliente);
        System.out.println("O número da sua agência é " + agencia);
        System.out.println("O número da sua conta é " + numeroConta);
        System.out.println("Atualmente seu saldo é: " + saldo);
        System.out.println();
        System.out.println("Somos honrados em ter você como cliente!");
        System.out.println();
        System.out.println("*********************************************************");


    }
}
