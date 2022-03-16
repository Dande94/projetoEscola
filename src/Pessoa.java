
public abstract class Pessoa{

	protected String nomeCompleto;
	protected long cpf;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public long getCPF() {
		return cpf;
	}

	public void setCPF(long cpf) {
		this.cpf = cpf;
	}
}
