public class Mestre extends Jedi {
    boolean videncia;
    boolean imortalidade;

    public Mestre(String nome, boolean telepatia, boolean telecinese, boolean persuasao, int porcentagemPazInterna, boolean videncia, boolean imortalidade) {
        super(nome, telepatia, telecinese, persuasao, porcentagemPazInterna);
        this.videncia = videncia;
        this.imortalidade = imortalidade;
	}
}