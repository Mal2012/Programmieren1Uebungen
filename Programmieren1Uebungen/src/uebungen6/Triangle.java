package uebungen6;
public class Triangle {
	Point a;
	Point b;
	Point c;

	Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point a() {
		return a;
	}

	public Point b() {
		return b;
	}

	public Point c() {
		return c;
	}

	double perimeter() {
		return a.laenge(b) + b.laenge(c) + c.laenge(a);
	}

	double area() {
		double u = (a.laenge(b) + b.laenge(c) + c.laenge(a)) / 2;
		return Math.sqrt(u * (u - a.laenge(b)) * (u - b.laenge(c))
				* (u - c.laenge(a)));
	}

	Triangle move(Point p) {
		Triangle nt = new Triangle(a.movePoint(p), b.movePoint(p),
				c.movePoint(p));
		return nt;
	}

	Triangle zoom(double f) {
		Triangle nt = new Triangle(a.stretch(f), b.stretch(f), c.stretch(f));
		return nt;
	}

	Triangle zoomed(Point p, double f) {
		a = a.movePoint(p.stretch(-1));
		b = b.movePoint(p.stretch(-1));
		c = c.movePoint(p.stretch(-1));

		Triangle nt = new Triangle(a.stretch(f), b.stretch(f), c.stretch(f));
		nt.a = nt.a.movePoint(p);
		nt.b = nt.b.movePoint(p);
		nt.c = nt.c.movePoint(p);
		return nt;
	}
	
	Point lowerLeft(){
		return new Point (Math.min(a.x(),Math.min(b.x(), c.x())),Math.min(a.y(), Math.min(b.y(),c.y())));
	}
	Point upperRight(){
		return new Point (Math.max(a.x(), Math.max(b.x(), c.x())), Math.max(a.y(), Math.max(b.y(), c.y())));
		
	}
}
