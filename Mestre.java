
public class Mestre {
	public String nome;
	public int anoNascimento;
	public String afiliacao;
	public String posto;

	public Mestre() {}

	public Mestre(String nome, int anoNascimento, String afiliacao, String posto) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	public int getIdade(int anoReferencia) {
		return anoReferencia - this.anoNascimento;
	}
	
	public String getAnoNascimentoString() {
		return String.valueOf(Math.abs(anoNascimento)) + (this.anoNascimento < 0 ? "ABY" : "DBY");
	}
	
	public boolean possuiForca() {
		return this.posto.equals("Jedi") || this.posto.equals("Sith");
	}
	
	public String getDescricao() {
		return String.format("Mestre: nome=%s, anoNascimento=%s, afiliacao=%s, posto=%s, possuiForca=%b.", this.nome, this.getAnoNascimentoString(), this.afiliacao, this.posto, this.possuiForca());
	}

}
