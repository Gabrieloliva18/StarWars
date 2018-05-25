public abstract class Ser {
	String nome;
	String sexo;
	String especie;
	int nascimento; //negativo se for ABY, positivo se for DBY
	int hp = 100;
	int dominioSabre;
	int dominioForca;
	
	public Ser(String nome, String sexo, String especie, int nascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.especie = especie;
		this.nascimento = nascimento;
	}
	
	public Ser(String nome, int sabre, int forca) {
		this.nome = nome;
		this.dominioForca = forca;
		this.dominioSabre = sabre;
	}
}
