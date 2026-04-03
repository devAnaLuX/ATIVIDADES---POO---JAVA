import java.util.Scanner;

public class ContaBancaria {

    Integer numero;
    String titular;
    Double saldo;
    int sacar = 0;
    Scanner leia = new Scanner(System.in);

    public ContaBancaria(Integer numero, String titular, Double saldoInicial) { //declaração de novas variáveis
        this.numero = numero; //numero lá de cima recebe o número declarado no main
        this.titular = titular; //titular lá de cima recebe o titular declarado no main
        this.saldo = saldoInicial + 50.0;  //o saldo lá de cima recebe o saldo declarado na classe main mais 50 reais de bônus
    }

    void SACAR(){                 //Método de saque
        if (sacar>=3){
            System.out.println("Limite de saques diário foi atingido!");
        }
        else {
            System.out.println("Quanto deseja sacar? ");
            double saque = leia.nextDouble();

            if (saque>=1000){
                System.out.println("Você não pode sacar um valor maior que R$1.000.");
            }
            else {
                saldo = saldo-saque;
                sacar++;
            }
        }
    }
    void DEPOSITAR(){             //Método de deposito
        System.out.println("Quanto deseja depositar? ");
        double depositar = leia.nextDouble();
        saldo = saldo + depositar;
    }
}
