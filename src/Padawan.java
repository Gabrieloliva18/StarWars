public class Padawan extends Jedi {
    boolean conhecimentoSabre;

    public Padawan(String nome, boolean telepatia, boolean telecinese, boolean persuasao, int porcentagemPazInterna, boolean conhecimentoSabre, int sabre, int forca) {
        super(nome, porcentagemPazInterna, telepatia, telecinese, persuasao, sabre, forca);
        this.conhecimentoSabre = conhecimentoSabre;
	}
}