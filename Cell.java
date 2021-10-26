public class Cell {
	private String s;
	private Cell next;
	
	public Cell(String s, Cell next) {
		this.s = s;
		this.next = next;
	}
	
	public Cell getNext() {
		return next;
	}
	
	public String getString() {
		return s;
	}
	
	public void setNext(Cell next) {
		this.next = next;
	}
	
}
