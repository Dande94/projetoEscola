
public class Estudante extends Pessoa {

	private String dataNascimento;
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void excluirDadosEstudante() {
		this.dataNascimento="";
		this.nomeCompleto="";
		this.cpf=0;
	}
}
