package forme;

public class Point {
	
	private static int nb = 0;
	private final int x;
	private final int y;
	
	public Point() {
		x = 0;
		y = 0;
		nb++;
	}

	public Point(int px, int py) {
		nb++;
		x = px;
		y = py;
	}
	
	public Point(Point p2) {
		nb++;
		x = p2.x;
		y = p2.y;
	}
	
	public void question1() {
		//On peut acceder aux attributs de Point car on est � l'int�rieur de la classe
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
	}
	
	static final int getNbPoint() {
		return nb;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point setX(int _x) {
		return new Point(_x,y);
	}
	
	public Point setY(int _y) {
		return new Point(x,_y);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+ this.x + "," + this.y + ")";
	}
	
	public boolean isSameAs(Point unPoint) {
		return (this.x == unPoint.x) && (this.y == unPoint.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		if(!(obj instanceof Point)) return false;
		Point p = (Point) obj;
		return x==p.x && y==p.y;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.x^Integer.rotateLeft(this.y,16);
	}
	
	public Point translate(int dx, int dy) {
		return new Point(x+dx, y+dy);
	}
}
