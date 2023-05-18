package pacote;

public class ContaBancaria {
	private double deposito;
	private double retirada;
	private double saldo;
	private String nomeDaPessoa;
	private int numeroDaConta;
	
	
	public ContaBancaria(String nomeDaPessoa , int numeroDaPessoa , double saldo) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getRetirada() {
		return retirada;
	}
	public void setRetirada(double retirada) {
		this.retirada = retirada;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}
	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public double verificarSaldo() {
		return saldo;
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
	public void saque(double retirada) {
		saldo -= retirada;
	}
}
	

