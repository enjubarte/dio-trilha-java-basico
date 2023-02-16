package src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome do Cliente: ");
        String nome = sc.next();
        System.out.print("Digite o número da Agência: ");
        String agencia = sc.next();
        System.out.print("Digite o número da Conta:  ");
        int conta = sc.nextInt();
        System.out.print("Digite o saldo da Conta: ");
        float saldo = sc.nextFloat();

        System.out.printf("Olá %s, " +
                "obrigado por  criar uma conta em nosso banco, sua agência é %s" +
                ", conta %d, e seu saldo %.2f já está disponivel para saque.", nome, agencia, conta,saldo);
    }
}
