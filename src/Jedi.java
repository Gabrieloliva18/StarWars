import java.util.ArrayList;
import java.util.List;

public abstract class Jedi extends Ser {
    int porcentagemPazInterna;
    boolean telepatia = false;
	boolean telecinese = false;
    boolean persuasao = false;
	List<Habilidades> listHab = new ArrayList<>();
	
    public Jedi(String nome, int porcentagem, boolean telepatia, boolean telecinese, boolean persuasao, int sabre, int forca) {
    	super(nome, sabre, forca);	
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
		this.porcentagemPazInterna = porcentagem;
	}

	public int getPercentualPazInterna() {
		return porcentagemPazInterna;
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