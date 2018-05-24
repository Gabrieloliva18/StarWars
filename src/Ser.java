public class Ser {
	String nome;
	String sexo;
	String especie;
	int nascimento; //negativo se for ABY, positivo se for DBY
	
	public Ser(String nome, String sexo, String especie, int nascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.especie = especie;
		this.nascimento = nascimento;
	}
	
	public Ser(String nome) {
		this.nome = nome;
	}
}
