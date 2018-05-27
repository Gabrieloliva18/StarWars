
public class Batalha {
	Mestre m1;
	Lorde l1;
	
	public Batalha(Lorde lorde, Mestre mestre) {
		m1 = mestre;
		l1 = lorde;
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
		if (l1.listHab.get(evtld - 1).getPrioridade() < m1.listHab.get(evtmt - 1).getPrioridade()) {
			System.out.print("Lorde");
			if (l1.listHab.get(evtld - 1).isSabre() == true)
				m1.hp = m1.hp - (l1.listHab.get(evtld - 1).getDano() * l1.dominioSabre / 100);
				else
					m1.hp = m1.hp - (l1.listHab.get(evtld - 1).getDano() * l1.dominioForca / 100);
			System.out.print(l1.listHab.get(evtld - 1).getImpressao());
			System.out.println("Mestre");
		}
		else if (m1.listHab.get(evtmt - 1).getPrioridade() < l1.listHab.get(evtld - 1).getPrioridade()) {
			System.out.print("Mestre");
			if (m1.listHab.get(evtmt - 1).isSabre() == true)
				l1.hp = l1.hp - (m1.listHab.get(evtmt - 1).getDano() * m1.dominioSabre / 100);
				else
					l1.hp = l1.hp - (m1.listHab.get(evtmt - 1).getDano() * m1.dominioForca / 100);
			System.out.print(m1.listHab.get(evtmt - 1).getImpressao());
			System.out.println("Lorde");
		}
		else {
			System.out.print("Lorde");
			if (l1.listHab.get(evtld - 1).isSabre() == true)
				m1.hp = m1.hp - (l1.listHab.get(evtld - 1).getDano() * l1.dominioSabre / 100);
				else
					m1.hp = m1.hp - (l1.listHab.get(evtld - 1).getDano() * l1.dominioForca / 100);
			System.out.print(l1.listHab.get(evtld - 1).getImpressao());
			System.out.println("Mestre");
			System.out.print("Mestre");
			if (m1.listHab.get(evtmt - 1).isSabre() == true)
				l1.hp = l1.hp - (m1.listHab.get(evtmt - 1).getDano() * m1.dominioSabre / 100);
				else
					l1.hp = l1.hp - (m1.listHab.get(evtmt - 1).getDano() * m1.dominioForca / 100);
			System.out.print(m1.listHab.get(evtmt - 1).getImpressao());
			System.out.println("Lorde");
		}
		System.out.println("HP Mestre = " + m1.hp + " HP Lorde = " + l1.hp);
		verificavitoria(m1, l1);
	}
	
	public void carregahabilidades(Mestre m, Lorde l) {
		Habilidades h1 = new Habilidades("Esquiva", 1, 0, " esquivou do ", false, false);
		Habilidades h2 = new Habilidades("Arremesar", 10, 1, " arremesou com forca o ", false, true);
		Habilidades h3 = new Habilidades("Derrubar", 15, 1, " derrubou com forca o ", false, true);
		Habilidades h4 = new Habilidades("Ataque Duplo", 40, 2, " deu um ataque duplo com sabre em ", true, false);
		Habilidades h5 = new Habilidades("Ataque", 30, 2, " atacou com sabre o ", true, false);
		l.listHab.add(h1);
		l.listHab.add(h2);
		l.listHab.add(h3);
		l.listHab.add(h4);
		l.listHab.add(h5);
		m.listHab.add(h1);
		m.listHab.add(h2);
		m.listHab.add(h3);
		m.listHab.add(h4);
		m.listHab.add(h5);	
	}
}


