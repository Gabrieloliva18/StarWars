public class Aprendiz extends Sith {
	String nomeDoMestre;
	boolean conhecimentoSabre; //se sabe construir seu sabre de luz
	
	public Aprendiz(String mestre, boolean sabre, String nomeNovo, boolean telepatia, boolean telecinese, boolean persuasao) {
		super(nomeNovo, telepatia, telecinese, persuasao);
		this.nomeDoMestre = mestre;
		this.conhecimentoSabre = sabre;
	}
}

