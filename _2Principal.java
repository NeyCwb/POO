package aplicandoOrientacaoObjeto;

public class _2Principal {
	
	public static void main(String[] args) {
		
		_1Filme meuFilme = new _1Filme();
		meuFilme.nome = "O Poderoso Chefão";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println(meuFilme.somaDasAvaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.pegaMedia());
	}

}

/* Classe: modelo estrutural para criação de objetos podendo ter atributos e métodos, retornando ou não algum valor.
Reaproveitamento de código: Organização e flexibilização do código.

*/


