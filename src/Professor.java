
public class Professor extends Pessoa {
	
	private double salario;
	
	public double getSalario() {
		return salario;
	} 
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void excluirDadosProfessor() {
		this.salario=0;
		this.nomeCompleto="";
		this.cpf=0;
		
	}
}
