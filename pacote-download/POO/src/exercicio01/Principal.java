package exercicio01;

public class Principal {
	public static void main(String[] args) {

		Funcionarios funcionario = new Funcionarios();
		funcionario.setNome("Laís");
		funcionario.setSetor("Quimica");
		funcionario.setSalario("55.756");
		funcionario.setAdmissao("12/02/2020");
		funcionario.setRG("4484481");
		
		funcionario.aumentoFuncionario (180);
		

		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Setor: " + funcionario.getSetor());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Admissao: " + funcionario.getAdmissao());
		System.out.println("RG: " + funcionario.getRG());
	
	}

}
