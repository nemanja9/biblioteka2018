package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	
	private LinkedList <Knjiga> knjige = new LinkedList<>();
	
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if (knjiga == null || !knjige.contains(knjiga))
			throw new RuntimeException("Knjiga je null ili ne postoji");
		knjige.add(knjiga);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
		
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
		
	}

	@Override
	public LinkedList<Knjiga> pronadjiSveKnjigu(String naslov, Autor autor, String isbn, String izdavac) {
		
		if (naslov==null)
			throw new RuntimeException("Morate uneti naslov");

		
		LinkedList<Knjiga> novaLista = new LinkedList<>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov))
				novaLista.add(knjige.get(i));
			
		}
		return novaLista;
	}

}
