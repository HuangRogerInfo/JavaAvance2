import java.util.Objects;

public class MyList {
	private Cell debut;
	private int size;
	
	public MyList() {
		// TODO Auto-generated constructor stub
		debut = null;
		size = 0;
	}
	
	/**
	 * Ajoute une cellule à la liste
	 * @param s : la valeur de la cellule
	 * 		
	 */
	public void add(String s) {
		Objects.requireNonNull(s);
		Cell svg = debut;
		debut = new Cell(s,svg);
		size ++;
	}
	
	/**
	 * Retourne la taille de la liste
	 * @return : la taille de la liste
	 */
	public int size() {
		/*
		int longueur = 1;
		Cell c = debut;
		if (debut == null) {
			return 0;
		}
		else {
			while(c.getNext()!=null) {
				longueur ++;
				c = c.getNext();
			}
			return longueur;
		}*/
		
		return this.size;
	}
	
	/**
	 * Ajoute une cellule à la fin de la liste
	 * @param s : la valeur de la cellule
	 */
	public void addLast(String s) {
		Cell c = debut;
		if(c==null) {
			debut = new Cell(s, null);
		}
		else {
			while(c.getNext() != null) {
				c = c.getNext();
			}
			c.setNext(new Cell(s,null));
		}
		size++;
	}
	
	/**
	 * Renvoie le contenu d'une cellule de la liste spécifiée par un index
	 * @param index : l'index de la cellule
	 * @return 		: la chaine contenue dans la cellule
	 * @throws Exception : liste vide ou index dépassant la taille de la liste
	 */
	public String get(int index) throws Exception {
		if (this.size== 0) {
			throw new Exception("Tentative d'accéder à une cellule d'une liste vide");
		}
		if (index > this.size() - 1) {
			throw new IndexOutOfBoundsException(index);
		}
		
		Cell c = debut;
		for(int i= 0; i<index ;i++) {
			c = c.getNext();
		}
		return c.getString();
	}
	
	public int sumLetter() {
		if(this.size == 0) {
			return 0;
		}
		Cell c = debut;
		int somme = c.getString().length();
		for(int i = 1; i<size; i++) {
			c = c.getNext();
			somme += c.getString().length();
		}
		return somme;	
	}
	
	@Override
	public String toString() {
		if(debut == null) {
			return "[Liste vide]";
		}
		
		Cell courant = debut;
		String s = "[" + courant.getString();
		
		while(courant.getNext()!=null) {
			courant = courant.getNext();
			s+= ", " + courant.getString();
		}
		s += "]";

		return s;
	}
}
