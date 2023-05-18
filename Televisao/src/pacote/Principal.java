package pacote;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operacao = 0, volume = 0, canal = 0 , valor;
		boolean ligado = false;
		
		List<String> canais = Arrays.asList("Globo" , "Record" , "SBT" , "Rede Vida" , "Band");
		Televisao tv = new Televisao(ligado , volume , canal , canais );
		
		do {
			System.out.println("Menu");
			System.out.println("1-Ligar TV");
			System.out.println("2-Desligar TV");
			System.out.println("3-Aumentar volume");
			System.out.println("4-Diminuir volume");
			System.out.println("5-Passar canal");
			System.out.println("6-Voltar canal");
			System.out.println("7-Status da TV");
			System.out.println("8-Encerrar Programa");
			operacao = sc.nextInt();
			
			switch(operacao) {
			case 1:
				tv.ligarTV();
				break;
			case 2:
				tv.desligarTV();
				break;
			case 3:
				System.out.println("Quanto será aumentado:");
				valor = sc.nextInt();
				tv.aumentarVolume(valor);
				break;
			case 4:
				System.out.println("Quanto será diminuido:");
				valor = sc.nextInt();
				tv.diminuirVolume(valor);
				break;
			case 5:
				tv.aumentarCanal();
				break;
			case 6 :
				tv.diminuirCanal();
				break;
			case 7 :
				tv.statusTV();
				break;
			}
			
		}while(operacao != 8);
		sc.close();
	}
}
