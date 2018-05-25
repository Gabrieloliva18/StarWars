public class Youngling extends Jedi {
    String mestre;
    boolean coletaDeCristais;

    public Youngling (String nomeNovo, int porcentagemPazInterna, boolean telepatia, boolean telecinese, boolean persuasao, boolean coleta, String mestre, int sabre, int forca) {
        super(nomeNovo, porcentagemPazInterna ,telepatia, telecinese, persuasao, sabre, forca);
        this.coletaDeCristais = coleta;
        this.mestre = mestre;
	}
}