package aplicandoOrientacaoObjeto;

public class _1Filme {

	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}

	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes ++;
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
	
	int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	
	
}

