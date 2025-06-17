package formDomain;

public class TestRows {
	public String nome, cpf,  
	cargo, codigo_atividade, 
	setor, disciplina, aih, 
	arquivo;

	
	
	public TestRows() {
		super();
	}

	public TestRows(String nome, String cpf, String cargo, String codigo_atividade, String setor, String disciplina,
			String aih, String arquivo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.codigo_atividade = codigo_atividade;
		this.setor = setor;
		this.disciplina = disciplina;
		this.aih = aih;
		this.arquivo = arquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCodigo_atividade() {
		return codigo_atividade;
	}

	public void setCodigo_atividade(String codigo_atividade) {
		this.codigo_atividade = codigo_atividade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getAih() {
		return aih;
	}

	public void setAih(String aih) {
		this.aih = aih;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	
	
}
