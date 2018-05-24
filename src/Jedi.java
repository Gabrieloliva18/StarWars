public class Jedi extends Ser {
    int porcentagemPazInterna;
    boolean telepatia = false;
	boolean telecinese = false;
    boolean persuasao = false;
    
    public Jedi(String nomeNovo, boolean telepatia, boolean telecinese, boolean persuasao) {
		super(nomeNovo);
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
	}

	public int getPercentualPazInterna() {
		return percentualRaiva;
	}
	public boolean isTelepatia() {
		return telepatia;
	}
	public boolean isTelecinese() {
		return telecinese;
	}
	public boolean isPersuasao() {
		return persuasao;
	}
}