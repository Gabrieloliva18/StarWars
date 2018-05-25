public class Mestre extends Jedi {
    boolean videncia;
    boolean imortalidade;

    public Mestre(String nome, boolean telepatia, boolean telecinese, boolean persuasao, int porcentagemPazInterna, boolean videncia, boolean imortalidade, int sabre, int forca) {
        super(nome, porcentagemPazInterna, telepatia, telecinese, persuasao, sabre, forca);
        this.videncia = videncia;
        this.imortalidade = imortalidade;
	}
}