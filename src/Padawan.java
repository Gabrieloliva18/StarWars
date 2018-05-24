public class Padawan extends Jedi {
    boolean conhecimentoSabre;

    public Padawan(String nome, boolean telepatia, boolean telecinese, boolean persuasao, int porcentagemPazInterna, boolean conhecimentoSabre) {
        super(nome, telepatia, telecinese, persuasao, porcentagemPazInterna);
        this.conhecimentoSabre = conhecimentoSabre;
	}
}