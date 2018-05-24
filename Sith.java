public abstract class Sith extends Ser {
	int percentualRaiva = 0;
	boolean telepatia = false;
	boolean telecinese = false;
	boolean persuasao = false;
	
	public Sith(String nomeNovo, boolean telepatia, boolean telecinese, boolean persuasao) {
		super(nomeNovo);
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
	}

	public int getPercentualRaiva() {
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
