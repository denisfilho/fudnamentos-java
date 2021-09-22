package ProjetoContaCliente;

import ProjetoContaCliente.Conta;

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);
        Conta contas[] = new Conta[2];

        for (int i=0; i<contas.length; i++){
            contas[i] = new Conta();
            contas[i] = contas[i].cadastrarConta(leTeclado, i);
        }

        verificaMaiorSaldo(contas);

        for (int i=0; i<contas.length; i++){
            System.out.println("Conta: " + contas[i].cliente.nome);
            System.out.println("- Saldo na Conta: " + contas[i].saldoConta);

            double credito = new Random().nextDouble();
            contas[i].creditar(credito);
            System.out.println("- Valor creditado : R$ " +  credito + " --> Novo Saldo: R$ " + contas[i].saldoConta);

            double debito = new Random().nextDouble();
            System.out.println("- Valor debitado : R$ " +  debito + " --> Novo Saldo: R$ " + contas[i].saldoConta);
            contas[i].debitar(debito);
        }
    }
    public static void verificaMaiorSaldo(Conta[] contas)
    {
        if (contas[0].saldoConta > contas[1].saldoConta){
            System.out.println("O cliente com maior saldo é " + contas[0].cliente.nome + " com R$ " + contas[0].saldoConta);
        } else if (contas[0].saldoConta < contas[1].saldoConta){
            System.out.println("O cliente com maior saldo é " + contas[1].cliente.nome + " com R$ " + contas[1].saldoConta);
        }
        else{
            System.out.println("Ambas as contas possuem o mesmo saldo");
        }
    }
}
