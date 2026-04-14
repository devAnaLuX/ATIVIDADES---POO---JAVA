//2 - Classes e Objetos
//Exercício: Criando a classe ContaBancaria.
//Detalhes: Migrar a lógica do exercício anterior para uma estrutura Orientada a Objetos. Criar
//a classe com os atributos numero, titular e saldo, e os métodos depositar() e sacar(). Instanciar
//no main.
//Regra de Negócio:
//- Todas as regras do exercício anterior devem ser seguidas também
//- Toda conta nova aberta ganha um bônus de boas-vindas de R$ 50,00 (isso deve ser
//garantido no momento da criação do objeto/construtor).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;
        boolean sair = false;
        Scanner leia = new Scanner(System.in);

        System.out.println("Seja bem-vindo!");
        System.out.println("Você ganhou um bônus de R$50");

        ContaBancaria saldos = new ContaBancaria(1,"Ana",5000.0);

        do{
            System.out.println("-----MENU-----");
            System.out.println("1- Ver Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("0- Sair");

            System.out.println("Digite uma opção: ");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(saldos.saldo);
                    break;
                case 2:
                    saldos.DEPOSITAR();
                    break;
                case 3:
                    saldos.SACAR();
                    break;
                case 0:
                    sair = true;
            }
        }
        while (sair == false);
    }
}

