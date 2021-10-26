public class CellGeneric<T> {
	private T s;
	private CellGeneric<T> next;
	
	public CellGeneric(T s, CellGeneric<T> next) {
		this.s = s;
		this.next = next;
	}
	
	public CellGeneric<T> getNext() {
		return next;
	}
	
	public T getString() {
		return s;
	}
	
	public void setNext(CellGeneric<T> next) {
		this.next = next;
	}
	
	public boolean equals(Object o) {
		if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof CellGeneric<?>)) {
            return false; 
        }
         
        CellGeneric<?> cell = (CellGeneric<?>) o; 
          
        return cell.getString().equals(this.s);
	}
	
}
