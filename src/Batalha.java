
public class Batalha {
	Mestre m1;
	Lorde l1;
	
	public Batalha(Lorde lorde, Mestre mestre) {
		m1 = mestre;
		l1 = lorde;
	}
	
	public int habilidade(int hab, int sabre, int forca) {
		if (hab == 1) { // habilidade 1 - esquivar
			System.out.print(" esquivou do ");
			return 0;
		}
		if (hab == 2) { // habilidade 2 - forca
			System.out.print(" arremesou com forca o ");
			return 10 * forca/100;
		}
		if (hab == 3) { // habilidade 3 - forca
			System.out.print(" derrubou com forca o ");
			return 15 * forca/100;
		}
		if (hab == 4) { // habilidade 4 - sabre
			System.out.print(" deu um ataque duplo com sabre em ");
			return 40 * sabre/100;
		}
		if (hab == 5) { // habilidade 5 - sabre
			System.out.print(" atacou com sabre o ");
			return 30 * sabre/100;
		}
		else 
			return 0;
	}
	
	public void verificavitoria(Mestre m1, Lorde l1) {
		if (m1.hp <= 0 && l1.hp > 0) {
			System.out.println("Lorde venceu!");
			System.exit(0);
			
		}
		if (l1.hp <= 0 && m1.hp > 0) {
			System.out.println("Mestre venceu!");
			System.exit(0);
		}
		if (l1.hp <= 0 && m1.hp <= 0) {
			System.out.println("Empate! Os dois morreram!");
			System.exit(0);
		}
	}
	
	public void luta(int evtld, int evtmt) {
		if (evtld < evtmt) {
			System.out.print("Lorde");
			m1.hp = m1.hp - habilidade(evtld, l1.dominioSabre, l1.dominioForca);
			System.out.println("Mestre");
		}
		else if (evtmt < evtld) {
			System.out.print("Mestre");
			l1.hp = l1.hp - habilidade(evtmt, m1.dominioSabre, m1.dominioForca);
			System.out.println("Lorde");
		}
		else {
			System.out.print("Lorde");
			m1.hp = m1.hp - habilidade(evtld, l1.dominioSabre, l1.dominioForca);
			System.out.println("Mestre");
			System.out.print("Mestre");
			l1.hp = l1.hp - habilidade(evtmt, m1.dominioSabre, m1.dominioForca);
			System.out.println("Lorde");
		}
		System.out.println("HP Mestre = " + m1.hp + " HP Lorde = " + l1.hp);
		verificavitoria(m1, l1);
	}
}


