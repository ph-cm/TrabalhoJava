package pacote;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeDaPessoa;
		double saldo , deposito , retirada ;
		int   numeroDaConta , operacao = 0;
		
		
		System.out.println("Nome:");
		nomeDaPessoa = sc.nextLine();
		System.out.println("Numero da conta:");
		numeroDaConta = sc.nextInt();
		System.out.println("Saldo: ");
		saldo = sc.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(nomeDaPessoa , numeroDaConta , saldo);
		
		do {
			System.out.println("OPERAÇÕES");
			System.out.println("1-VERIFICAR SALDO");
			System.out.println("2-DEPOSITAR");
			System.out.println("3-SACAR");
			System.out.println("4-SAIR");
			operacao = sc.nextInt();
			
			switch(operacao) {
			case 1 :
				System.out.println("SALDO: " + conta.verificarSaldo());
				break;
			case 2 :
				System.out.println("VALOR PARA DEPOSITO: ");
				deposito = sc.nextDouble();
				conta.depositar(deposito);
				break;
			case 3: 
				System.out.println("VALOR QUE SERÁ SACADO: ");
				retirada = sc.nextDouble();
				conta.saque(retirada);
				
				break;
			case 4:
				System.out.println("PROGRAMA ENCERRADO");
				
				break;
				
			default:
				System.out.println("OPÇÃO  INVALIDA");
				break;
			}
		}while(operacao != 4);
		
	sc.close();	
	}
	
}
