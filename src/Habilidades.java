
public class Habilidades {
	private String nome;
	private int dano;
	private int prioridade;
	private String impressao;
	private boolean sabre;
	private boolean forca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public String getImpressao() {
		return impressao;
	}
	public void setImpressao(String impressao) {
		this.impressao = impressao;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public boolean isSabre() {
		return sabre;
	}
	public void setSabre(boolean sabre) {
		this.sabre = sabre;
	}
	public boolean isForca() {
		return forca;
	}
	public void setForca(boolean forca) {
		this.forca = forca;
	}
	public Habilidades(String nome, int dano, int prioridade, String impressao, boolean sabre, boolean forca) {
		setNome(nome);
		setDano(dano);
		setPrioridade(prioridade);
		setImpressao(impressao);
		setSabre(sabre);
		setForca(forca);
	}
}
