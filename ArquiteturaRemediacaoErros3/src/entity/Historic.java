package entity;

public class Historic {

	private Answer resposta;
	
	private Action etapa;
	
	private Integer numeroTentativas;
	
	private Student aluno;

	public Answer getResposta() {
		return resposta;
	}

	public void setResposta(Answer resposta) {
		this.resposta = resposta;
	}

	public Action getEtapa() {
		return etapa;
	}

	public void setEtapa(Action etapa) {
		this.etapa = etapa;
	}

	public Integer getNumeroTentativas() {
		return numeroTentativas;
	}

	public void setNumeroTentativas(Integer numeroTentativas) {
		this.numeroTentativas = numeroTentativas;
	}

	public Student getAluno() {
		return aluno;
	}

	public void setAluno(Student aluno) {
		this.aluno = aluno;
	}
	
	
}
