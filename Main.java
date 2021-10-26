import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		// Exercice 1 Question 8
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		System.out.println(ml);
		
		try{
			System.out.println(ml.get(3));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(ml.sumLetter());
		
		// Exercice 2
		MyListGeneric<Integer> ml2 = new MyListGeneric<Integer>();
		ml2.addLast(1);
		ml2.add(2);
		ml2.add(3);
		ml2.addLast(4);
		System.out.println(ml2);
		
		try{
			System.out.println(ml2.get(3));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(ml2.sumLetter());
		System.out.println(ml2.contains(new CellGeneric<Integer>(1,null)));
		
		//Exercice 3
		
		 Map<Point, Circle> m = new HashMap<>();
		 Point p1 = new Point(100,150);
		 Circle c1 = new Circle(p1,100);
		 m.put(p1, c1);
		 System.out.println(m.containsKey(p1));
		 System.out.println(m.containsKey(new Point(100,150)));
		
	}
}
