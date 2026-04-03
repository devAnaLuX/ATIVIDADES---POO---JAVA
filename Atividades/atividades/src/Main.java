//1 - Lógica e Estruturas de Controle
//Exercício: Simulador de Caixa Eletrônico (Apenas Lógica no main).
//Detalhes: Criar um menu com do-while e switch (1-Ver Saldo, 2-Depositar, 3-Sacar, 0-Sair).
//Regra de Negócio:
//- O caixa eletrônico tem um limite máximo de 3 saques diários. Se o usuário tentar um 4o
//saque, o sistema deve bloquear a operação informando "Limite de saques diários
//atingido".
//- O valor máximo por saque é de R$ 1.000,00, por questões de segurança.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;             //declaração da variável de escolha da opção
        double saldo = 5000;     //declaração e atribuição de um valor a variável saldo
        double depositar;
        int sacar = 0;           //declaração da variável da contagem de saques
        double saque;
        boolean sair = false;    //declaração da variável de saída do programa
        Scanner leia = new Scanner(System.in);  //declaração do scanner

        do{                                                 //aqui ele imprime o menu e faz o switch e depois
            System.out.println("-----MENU-----");           //verifica se a condição é verdadeira, senao for
            System.out.println("1- Ver Saldo");             //verdadeira, entra em um looping
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("0- Sair");

            System.out.println("Digite uma opção: ");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar? ");
                    depositar = leia.nextDouble();
                    saldo = saldo + depositar;
                    break;
                case 3:
                    if (sacar>=3){
                        System.out.println("Limite de saques diário foi atingido!");
                    }
                    else {
                        System.out.println("Quanto deseja sacar? ");
                        saque = leia.nextDouble();

                        if (saque>=1000){
                            System.out.println("Você não pode sacar um valor maior que R$1.000.");
                        }
                        else {
                            saldo = saldo-saque;
                            sacar++;
                        }
                    }
                    break;
                case 0:
                    sair = true;
            }
        }
        while (sair == false);
    }
}