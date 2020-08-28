package exercicio01;

public class Funcionarios {

	private String Nome;
	private String Setor;
	protected double Salario;
	private String Admissao;
	private String RG;

	public Funcionarios(String nome, String setor, double salario, String admissao, String RG) {
		this.Nome = nome;
		this.Setor = setor;
		this.Salario = salario;
		this.Admissao = admissao;
		this.RG = RG;

	}

	public Funcionarios(String nome, String setor, String admissao, String rG) {
	}

	public Funcionarios() {
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSetor() {
		return Setor;
	}

	public void setSetor(String setor) {
		Setor = setor;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public String getAdmissao() {
		return Admissao;
	}

	public void setAdmissao(String admissao) {
		Admissao = admissao;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public void aumentoFuncionario(double valorBeneficio) {
		setSalario(getSalario() + valorBeneficio);
		
	}

	public void setSalario(String string) {
		
	}

}
