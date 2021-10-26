package forme;

public class Circle {
	private final Point centre;
	private final int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		centre = new Point(1,1);
		radius = 1;
	}
	
	public Circle(Point p, int r) {
		centre = p;
		radius = r;
	}
	
	public Circle translate(int dx, int dy) {
		return new Circle(centre.translate(dx, dy),radius);
	}
	
	public Point getCenter() {
		return centre;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double area() {
		return Math.pow(radius, 2)* Math.PI;
	}
	
	public boolean contains(Point p) {
		double distance_p = Math.sqrt(   Math.pow((p.getX()-centre.getX()),2) + Math.pow((p.getY()-centre.getY()),2) );
		if(distance_p<=radius) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle[] cercles) {
		for(Circle c : cercles) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		if(!(obj instanceof Circle)) return false;
		Circle c = (Circle) obj;
		return c.getCenter().equals(this.getCenter()) && c.getRadius() == this.getRadius();
	}
	
	@Override
	public String toString() {
		return "[centre=" + centre.toString() + " Radius=" + radius + " Area=" + this.area() + "]";
	}

}
