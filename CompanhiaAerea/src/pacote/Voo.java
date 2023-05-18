package pacote;

public class Voo {
	
	private int pessoa;//quantidade de pessoas
	private String horario;//string por conta do formato do horario (20:40)
	private String data;//(20/03/2003)
	private int valor;//para a remoção/adição de passageiros
	
	public Voo(int pessoa , String data , String horario) {
		this.pessoa = pessoa;
		this.data = data;
		this.horario = horario;
	}

	public int getPessoa() {
		return pessoa;
	}

	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int verificarOcupacao() {
		return pessoa;
	}
	public void adicionarPassageiro(int valor) {
		if(pessoa + valor < 100) {
		pessoa += valor;
		}
	}
	public void removerPassageiro(int valor) {
		if(pessoa - valor> 0) {
		pessoa -= valor;
		}
	}
	public void mostrarStatus() {
		System.out.println("QUANTIDADE DE PASSAGEIROS: " + pessoa);
		System.out.println("DATA: " + data);
		System.out.println("HORARIO: " + horario);

	}
	
}
