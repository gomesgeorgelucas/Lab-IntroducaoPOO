
public class Conexao {

	public String tipoPorta;
	public int idProtocolo;
	public int taxaTransmissao;
	
	public Conexao() {}

	public Conexao(String tipoPorta, int idProtocolo, int taxaDeTransmissao) {
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaDeTransmissao;
	}
	
	public String getProtocoloString() {
		return this.idProtocolo == 1 ? "Rotoscope" : this.idProtocolo == 2 ? "Acustico" : this.idProtocolo == 3 ? "Radio" : "Outros"; 
	}
	
	public double getTaxaMBps() {
		return this.taxaTransmissao / 1024;
	}
	
	public String getDescricao() {
		return String.format("Conexao: tipoPorta=%s, protocolo=%s, taxaTransmissao=%.1fMBps.", this.tipoPorta, this.getProtocoloString(), this.getTaxaMBps());
	}
	
	

}
