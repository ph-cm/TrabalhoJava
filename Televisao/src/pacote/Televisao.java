package pacote;

import java.util.List;

public class Televisao {
	private boolean ligado;
	private int volume;
	private List<String> canais;
	private int canal;
	private int valor;
	
	public Televisao(boolean ligado , int volume , int canal , List<String>canais) {
		this.ligado = ligado;
		this.volume =  volume;
		this.canais = canais;
		this.canal = canal;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<String> getCanais() {
		return canais;
	}

	public void setCanais(List<String> canais) {
		this.canais = canais;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	//LIGAR E DESLIGAR
	public void ligarTV() {
		ligado = true;
		System.out.println("TV ligada");
	}
	public void desligarTV() {
		ligado = false;
		System.out.println("TV desligada");
	}
	
	//AUMENTAR E DIMINUIR VOLUME
	public void aumentarVolume(int valor) {
		if(ligado == true && volume < 100) {
			volume += valor;
			System.out.println("Volume atual: " + volume);
		}
	}
	public void diminuirVolume(int valor) {
		if(ligado == true && volume > 0) {
			volume -= valor;
			System.out.println("Volume atual: " + volume);
		}
	}
	//AUMENTAR E DIMINUIR CANAL
	public void aumentarCanal() {
		if(ligado == true && canal < canais.size() - 1) {
			canal++;
			System.out.println("Canal atual " + canais.get(canal));
		}
	}
	public void diminuirCanal() {
		if(ligado == true && canal > canais.size() - 5) {
			canal--;
			System.out.println("Canal atual " + canais.get(canal));
		}
	}
	//STATUS DA TV
	public void statusTV() {
		System.out.println("Status da tv");
		if(ligado == true) {
			System.out.println("Situação: ligada");
		}
		else {
			System.out.println("Situação: desligada");
		}
		System.out.println("Volume: " + volume);
		System.out.println("Canal: " + canais.get(canal));
	}
}
