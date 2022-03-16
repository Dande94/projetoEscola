import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitarOpMenu() {		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo \n"
			+ "1- Registrar estudante \n"
			+ "2- Registrar professor \n"
			+ "3- Ver dados do professor \n"
			+ "4- Ver dados do estudante \n"
			+ "5- Apagar dados professor \n"
			+ "6- Apagar dados estudante \n"
			+ "7- Sair do programa"));
		return opcao;
	}
	
	public static String solicitarNomeCompleto(String mensagem) {		
		String nomeCompleto = JOptionPane.showInputDialog(mensagem);
		return nomeCompleto;
	}
	
	public static long solicitarCPF() {
		long cpf = Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf:"));
		return cpf;
	}
	
	public static double solicitarSalario(String mensagem) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return salario;
	}
	
	public static String solicitarDataNascimento(String mensagem) {		
		String dataNascimento = JOptionPane.showInputDialog(mensagem);		
		return dataNascimento;
	}
	
	public static void mostrarDadosEstudante(Estudante e) {
		
		JOptionPane.showMessageDialog(null,"Os dados do estudante são: \n"
				+ "Nome: "+e.getNomeCompleto()+"\n"
				+ "CPF: "+e.getCPF()+"\n"
				+ "Data de nascimento: "+e.getDataNascimento());
	}
	
	public static void mostrarDadosProfessor(Professor p) {
		
		JOptionPane.showMessageDialog(null,"Os dados do professor são: \n"
				+ "Nome: "+p.getNomeCompleto()+"\n"
				+ "CPF: "+p.getCPF()+"\n"
				+ "Salario: "+p.getSalario());
	}
	
	public static void mostrarMensagem() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado e os dados perdidos");	
	}
}
