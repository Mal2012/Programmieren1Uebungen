package uebungen6;

public class Point{
double x,y;

	Point(double x, double y){
		this.x=x;
		this.y=y;
		
	}	
	
	
	double x(){
		return x;
	}
	
	double y(){
		return y;
	}	
	

	 	public String toString(){
		String result = "x: "+x()+" y: "+y();
		return result;
	}

    public double laenge(Point pb) {
        return Math.hypot(x - pb.x(), y - pb.y());
    }
    
    Point movePoint(Point p){
    	Point np = new Point(x+p.x(), y+p.y()); 
    	return np;
    }
    Point stretch(double f){
    	Point np = new Point(x*f, y*f);
    	return np;
    }

}
