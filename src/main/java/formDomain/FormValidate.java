package formDomain;

import java.sql.Date;
import java.text.DateFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "products")
public class FormValidate {
	
	public String numlinha, numfunc, numvinc, nome, cpf,  
	cargo, codigo_atividade, setor, disciplina, aih, arquivo;
	
	public Date dtini, dtfim;	
	
	public FormValidate() {
		super();
	}

	public FormValidate(String numlinha, String numfunc, String numvinc, String nome, String cpf, String cargo,
			String codigo_atividade, String setor, String disciplina, String aih, String arquivo, Date dtini,
			Date dtfim) {
		super();
		this.numlinha = numlinha;
		this.numfunc = numfunc;
		this.numvinc = numvinc;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.codigo_atividade = codigo_atividade;
		this.setor = setor;
		this.disciplina = disciplina;
		this.aih = aih;
		this.arquivo = arquivo;
		this.dtini = dtini;
		this.dtfim = dtfim;
	}

	public String getNumlinha() {
		return numlinha;
	}

	public void setNumlinha(String numlinha) {
		this.numlinha = numlinha;
	}

	public String getNumfunc() {
		return numfunc;
	}

	public void setNumfunc(String numfunc) {
		this.numfunc = numfunc;
	}

	public String getNumvinc() {
		return numvinc;
	}

	public void setNumvinc(String numvinc) {
		this.numvinc = numvinc;
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

	public Date getDtini() {
		return dtini;
	}

	public void setDtini(Date dtini) {
		this.dtini = dtini;
	}

	public Date getDtfim() {
		return dtfim;
	}

	public void setDtfim(Date dtfim) {
		this.dtfim = dtfim;
	}

	
	
	

	
	
	
}
