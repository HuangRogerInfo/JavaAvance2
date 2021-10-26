import java.util.Objects;

public class MyListGeneric<T> {
	private CellGeneric<T> debut;
	private int size;
	
	public MyListGeneric() {
		// TODO Auto-generated constructor stub
		debut = null;
		size = 0;
	}
	
	/**
	 * Ajoute une cellule à la liste
	 * @param s : la valeur de la cellule
	 * 		
	 */
	public void add(T s) {
		Objects.requireNonNull(s);
		CellGeneric<T> svg = debut;
		debut = new CellGeneric<T>(s,svg);
		size ++;
	}
	
	/**
	 * Retourne la taille de la liste
	 * @return : la taille de la liste
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Ajoute une cellule à la fin de la liste
	 * @param s : la valeur de la cellule
	 */
	public void addLast(T s) {
		CellGeneric<T> c = debut;
		if(c==null) {
			debut = new CellGeneric<T>(s, null);
		}
		else {
			while(c.getNext() != null) {
				c = c.getNext();
			}
			c.setNext(new CellGeneric<T>(s,null));
		}
		size++;
	}
	
	/**
	 * Renvoie le contenu d'une cellule de la liste spécifiée par un index
	 * @param index : l'index de la cellule
	 * @return 		: la chaine contenue dans la cellule
	 * @throws Exception : liste vide ou index dépassant la taille de la liste
	 */
	public T get(int index) throws Exception {
		if (this.size== 0) {
			throw new Exception("Tentative d'accéder à une cellule d'une liste vide");
		}
		if (index > this.size() - 1) {
			throw new IndexOutOfBoundsException(index);
		}
		
		CellGeneric<T> c = debut;
		for(int i= 0; i<index ;i++) {
			c = c.getNext();
		}
		return c.getString();
	}
	
	
	public int sumLetter() {
		if(this.size == 0) {
			return 0;
		}
		CellGeneric<T> c = debut;
		int somme = c.getString().toString().length();
		for(int i = 1; i<size; i++) {
			c = c.getNext();
			somme += c.getString().toString().length();
		}
		return somme;	
	}
	
	
	public boolean contains(Object o) {
		CellGeneric<T> c = debut;
		for(int i= 0; i<size ;i++) {
			if(c.equals(o) == true) {
				return true;
			}
			c = c.getNext();
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		if(debut == null) {
			return "[Liste vide]";
		}
		
		CellGeneric<T> courant = debut;
		String s = "[" + courant.getString();
		
		while(courant.getNext()!=null) {
			courant = courant.getNext();
			s+= ", " + courant.getString();
		}
		s += "]";

		return s;
	}
}
