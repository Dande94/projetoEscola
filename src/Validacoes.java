
public class Validacoes {

	public static boolean validarNome(String nomeCompleto) {
		
		if(nomeCompleto.length()>=4) {
			return true;
		}		
		return false;
	}

	public static boolean validarCPF(long cpf) {
		if(cpf > 0) {
			return true;
		}
		return false;
	}
	
	public static boolean validarSalario(double salario) {
		if(salario > 0) {
			return true;
		}
		return true;
	}
	
	public static boolean validarDataNascimento(String dataNascimento) {
		if(dataNascimento.length()==8){
			return true;
		}		
		return false;
	}
}
