
public class Principal {
	public static void main(String[] args) {
		Lorde lorde = new Lorde("Darth Maul", true, false, true, 90,80);
		Mestre mestre = new Mestre("Obiwan", true, true, true, 99, false, true, 80, 90);
		Batalha fight = new Batalha(lorde, mestre);
		

		fight.luta(1, 3);
		fight.luta(4, 5);
		fight.luta(4, 5);
		fight.luta(2, 3);
		fight.luta(5, 4);
		fight.luta(4, 5);
		fight.luta(4, 5);
		fight.luta(4, 5);
		

	}
}
