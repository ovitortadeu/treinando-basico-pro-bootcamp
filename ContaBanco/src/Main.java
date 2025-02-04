import Conta.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número da agência");
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Agora digite a sua agência");
        conta.setAgencia(sc.nextLine());
        System.out.println("Agora digite seu nome");
        conta.setNomeCliente(sc.nextLine());
        System.out.println("Por final diga o seu saldo");
        conta.setSaldo(sc.nextDouble());

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta" +
                conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponivel para saque");


    }
}