package entidades;

public class Historico {

	private Resposta resposta;
	
	private Acao etapa;
	
	private Integer numeroTentativas;
	
	private Aluno aluno;

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	public Acao getEtapa() {
		return etapa;
	}

	public void setEtapa(Acao etapa) {
		this.etapa = etapa;
	}

	public Integer getNumeroTentativas() {
		return numeroTentativas;
	}

	public void setNumeroTentativas(Integer numeroTentativas) {
		this.numeroTentativas = numeroTentativas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
