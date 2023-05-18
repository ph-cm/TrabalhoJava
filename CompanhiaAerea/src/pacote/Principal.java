package pacote;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int pessoa , operacao = 0 , valor = 0;
		String data;
		String horario;
		
		
		System.out.println("Quantidade de passageiros: ");
		pessoa = sc.nextInt();
		
		System.out.print("(DD/MM/AA)-Data:");
		data = sc.next();
		
		System.out.print("(HH:MM)-Horario:");
		horario = sc.next();
		
		Voo novoVoo = new Voo(pessoa , data , horario);
		
		do {
			System.out.println("--MENU--");
			System.out.println("1-VERIFICAR OCUPAÇÃO DO VOO");
			System.out.println("2-ADICIONAR PASSAGEIROS");
			System.out.println("3-REMOVER PASSAGEIROS");
			System.out.println("4-STATUS DO VOO");
			System.out.println("5-FINALIZAR PROGRAMA");
			operacao = sc.nextInt();
			
			switch(operacao){
			case 1:
				System.out.println("HÁ " + novoVoo.verificarOcupacao() + " PASSAGEIROS");
				
				break;
			case 2:
				System.out.println("QUANTOS PASSAGEIROS: ");
				valor = sc.nextInt();
				novoVoo.adicionarPassageiro(valor);
				break;
				
			case 3: 
				System.out.println("QUANTOS PASSAGEIROS: ");
				valor = sc.nextInt();
				novoVoo.removerPassageiro(valor);				
				break;
				
			case 4:
				novoVoo.mostrarStatus();
				break;
			case 5:
				System.out.println("PROGRAMA ENCERRADO");
				break;
				
				
			default :
				System.out.println("NUMERO ERRADO");
				break;
			}
				
		}while(operacao != 5);
		sc.close();
	}
}
