public class Aprendiz extends Sith {
	String nomeDoMestre;
	boolean conhecimentoSabre; //se sabe construir seu sabre de luz
	
	public Aprendiz(String mestre, boolean conhecsabre, String nomeNovo, boolean telepatia, boolean telecinese, boolean persuasao, int sabre, int forca) {
		super(nomeNovo, telepatia, telecinese, persuasao, sabre, forca);
		this.nomeDoMestre = mestre;
		this.conhecimentoSabre = conhecsabre;
	}
}

