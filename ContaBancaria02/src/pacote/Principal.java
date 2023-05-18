package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	
	public static  ArrayList<ContaBancariaT> contas = new ArrayList<ContaBancariaT>();
	
	
	public static void main (String[] args) {
	
		int aux = 4;
		
		do {
			System.out.println("1-Inserir pessoas");
			System.out.println("2-Acessar conta");
			System.out.println("0-sair");
			aux = sc.nextInt();
			
			switch(aux) {
			case 1 : 
				inserirPessoa();
				break;
			case 2:
				acessarConta();
				break;
			case 0:
				System.out.println("SAINDO");
				break;
			default:
				System.out.println("INVALIDO");
				break;
			}
		}while( aux != 0);
		
}
	public static void acessarConta() {
		int operacao , numeroDaConta , numeroDaContaDestino;
		double valor; 
		
	if(contas.size() < 2) {
		System.out.println("INVALIDO");
		return;
	}
	
	System.out.println("Digite o numero da conta: ");
	numeroDaConta = sc.nextInt();
	
	ContaBancariaT conta = buscarConta(numeroDaConta);
	
	if(conta == null) {
		System.out.println("NAO ENCONTRADO");
		return;
	}
	
	
	do{
		System.out.println("--MENU--");
		System.out.println("1-VERIFICAR SALDO");
		System.out.println("2-DEPOSITO");
		System.out.println("3-SAQUE");
		System.out.println("4-TRANSFERENCIA");
		System.out.println("5-VOLTAR PRO MENU");
		System.out.println("6-ENCERRAR OPERAÇÕES");
		operacao = sc.nextInt();
		
		switch(operacao) {
		case 1:
			conta.verificarSaldo();				
			break;
		case 2: 
			System.out.println("VALOR PARA DEPÓSITO: ");
			valor = sc.nextDouble();
			conta.depositarDinheiro(valor);
			break;
		case 3:
			System.out.println("VALOR PARA SAQUE:");
			valor = sc.nextDouble();
			conta.sacarDinheiro(valor);
			break;
		case 4 :
			System.out.println("Numero conta destinataria: ");
			numeroDaContaDestino = sc.nextInt();
			
			ContaBancariaT contaDestinataria = buscarConta(numeroDaContaDestino);
			
			if (contaDestinataria == null) {
                System.out.println("Conta de Destino Não Encontrada!");
            } else {
                System.out.print("Valor a ser Transferido: ");
                valor = sc.nextDouble();
                conta.transferirDinheiro(contaDestinataria, valor);
            }
			
			break;
		case 5:
			System.out.println("Retornando");
			return; 
			
		case 6 :
			operacao = 6;
			break;
		default :
			System.out.println("OPCAO INVALIDA");
			break;
			
			}
		}while(operacao != 6);
	}
	public static ContaBancariaT  buscarConta(int numeroDaConta) {
		 for (ContaBancariaT conta : contas) {
	            if (conta.getNumeroDaConta() == numeroDaConta) {
	                return conta;
	            }
		 }
		 return null;
	}
	public static void inserirPessoa() {
		int  numeroDaConta , pessoa;
		String nome;
		
		System.out.println("Digite o numero de pessoas: ");
		pessoa = sc.nextInt();
		
		ContaBancariaT[] conta = new ContaBancariaT[pessoa];//vai criar um vetor com pessoas(quantidade)
		
		for(int i = 0 ; i < pessoa ; i++) {
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.println("Numero da Conta: ");
			numeroDaConta = sc.nextInt();
		
			
			conta[i] = new ContaBancariaT(nome , numeroDaConta );
			contas.add(conta[i]);
		}
	}
}
