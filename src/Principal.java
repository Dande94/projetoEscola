public class Principal {

	public static void main(String[] args) {
		
		Professor p = new Professor();
		Estudante e = new Estudante();
		
		int opcao = 0;
		do {
			
			opcao = EntradaSaida.solicitarOpMenu();
			
			switch (opcao) {
			
				case 1:
					e.setNomeCompleto(EntradaSaida.solicitarNomeCompleto("Informe a nome do estudante:"));							
					while (Validacoes.validarNome(e.getNomeCompleto())==false) {
						e.setNomeCompleto(EntradaSaida.solicitarNomeCompleto("Informe a nome do estudante válido:"));
					}
					
					e.setCPF(EntradaSaida.solicitarCPF());
					while(Validacoes.validarCPF(e.getCPF())==false) {
						e.setCPF(EntradaSaida.solicitarCPF());
					}
					
					e.setDataNascimento(EntradaSaida.solicitarDataNascimento("Informe a data de nascimento do estudante:"));							
					while (Validacoes.validarDataNascimento(e.getDataNascimento())==false) {
						e.setDataNascimento(EntradaSaida.solicitarNomeCompleto("Informe a data de nascimento do estudante válido:"));
					}
				break;
				
				case 2:
					p.setNomeCompleto(EntradaSaida.solicitarNomeCompleto("Informe a nome do professor:"));							
					while (Validacoes.validarNome(p.getNomeCompleto())==false) {
						p.setNomeCompleto(EntradaSaida.solicitarNomeCompleto("Informe a nome do professor válido:"));
					}
					
					p.setCPF(EntradaSaida.solicitarCPF());
					while(Validacoes.validarCPF(p.getCPF())==false) {
						p.setCPF(EntradaSaida.solicitarCPF());
					}
					
					p.setSalario(EntradaSaida.solicitarSalario("Informe o salario do professor:"));
					while(Validacoes.validarSalario(p.getSalario())==false){
						p.setSalario(EntradaSaida.solicitarSalario("Informe o salario do professor válido:"));
					}
				break;
				
				case 3:
					EntradaSaida.mostrarDadosProfessor(p);
				break;
				
				case 4:
					EntradaSaida.mostrarDadosEstudante(e);
				break;
				
				case 5:
					p.excluirDadosProfessor();
				break;
				
				case 6:
					e.excluirDadosEstudante();
				break;
				
				case 7:
					EntradaSaida.mostrarMensagem();
				break;
				
			}
		}while(opcao!=7);

	}

}
