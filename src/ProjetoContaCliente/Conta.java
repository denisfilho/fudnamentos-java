package ProjetoContaCliente;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    long numeroConta;
    double saldoConta;
    Cliente cliente;

    public Conta cadastrarConta(Scanner leTeclado, int contasCadastradas){
        Conta contaCriada = new Conta();
        contaCriada.numeroConta = new Random().nextLong();
        contaCriada.saldoConta = new Random().nextDouble();

        contaCriada.cliente = new Cliente();
        System.out.print("Informe o cpf do cliente " + (contasCadastradas + 1) + " : ");
        contaCriada.cliente.cpf = leTeclado.next();

        System.out.print("Informe o nome do cliente " + (contasCadastradas + 1) + " : ");
        contaCriada.cliente.nome = leTeclado.next();

        return contaCriada;

    }
    public void creditar(double valor){
        saldoConta += valor;
    }

    public void debitar(double valor){
        saldoConta -= valor;
    }
}
