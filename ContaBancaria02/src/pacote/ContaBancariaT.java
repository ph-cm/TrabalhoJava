package pacote;

public class ContaBancariaT {
	private double montante;
	private String nome;
	private double saldo;
	private int numeroDaConta;
	
	public ContaBancariaT(String nome , int numeroDaConta ) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		this.saldo = 0 ;
	}

	public double getValor() {
		return montante;
	}

	public void setValor(int valor) {
		this.montante = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	
	public void verificarSaldo() {
		System.out.println("NUMERO DA CONTA: " + numeroDaConta + " \nSALDO ATUAL: " + saldo);
	}
	public void depositarDinheiro(double valor) {
		saldo = saldo + valor;
		System.out.println("Saldo atual: " + saldo);
	}
	public void sacarDinheiro(double valor) {
		saldo = saldo - valor;
		System.out.println("Saldo atual: " + saldo);
	}
	public void  transferirDinheiro(ContaBancariaT contaDestinataria , double valor) {//linkar objeto
		if(saldo > 0 && saldo >= valor) {
			saldo = saldo - valor;//retirar de uma conta
			contaDestinataria.saldo = contaDestinataria.saldo + valor;  //conta q vai receber o montante
			System.out.println("Novo saldo: ");
			System.out.println("( " + numeroDaConta + " ) - " + saldo);
			System.out.println("( " + contaDestinataria.saldo + " ) - Na conta "  + numeroDaConta);
		}
	}
	

}

