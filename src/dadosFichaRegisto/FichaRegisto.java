package dadosFichaRegisto;

//import dadosFichaRegisto.*;

public class FichaRegisto {
	Professor regente;
	unidadeCurricular cadeira;
	int codUnidade;
	int anoletivo;
	String observacoes;
	public FichaRegisto(Professor regente, unidadeCurricular cadeira, int codUnidade, int anoletivo,
			String observacoes) {
		super();
		this.regente = regente;
		this.cadeira = cadeira;
		this.codUnidade = codUnidade;
		this.anoletivo = anoletivo;
		this.observacoes = observacoes;
	}
	
	public Professor getRegente() {
		return regente;
	}
	public void setRegente(Professor regente) {
		this.regente = regente;
	}
	public unidadeCurricular getCadeira() {
		return cadeira;
	}
	public void setCadeira(unidadeCurricular cadeira) {
		this.cadeira = cadeira;
	}
	public int getCodUnidade() {
		return codUnidade;
	}
	public void setCodUnidade(int codUnidade) {
		this.codUnidade = codUnidade;
	}
	public int getAnoletivo() {
		return anoletivo;
	}
	public void setAnoletivo(int anoletivo) {
		this.anoletivo = anoletivo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
