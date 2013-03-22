package ampel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;

public class AmpelTest extends Canvas {
	static Ampel a1= new Ampel();
	  public Dimension getMinimumSize() {
	    return new Dimension(100,260);
	  }
	  public Dimension getPreferredSize() {
	    return getMinimumSize();
	  }

	  public void paint (Graphics g) {
	    g.setColor (Color.black);
	    g.fillRect (10, 10, 80, 240);
	   if(a1.status==0||a1.status==1){
	    g.setColor (Color.red);
	    g.fillOval (20, 20, 60, 60);
	   }
	   if(a1.status==1||a1.status==11){
	    g.setColor (Color.yellow);
	    g.fillOval (20, 100, 60, 60);
	    }
	   if(a1.status==10){
	    g.setColor (Color.green);
	    g.fillOval (20, 180, 60, 60);
	   }
	  }

	  public static void main (String[] args) {
	
		  
	    Frame f = new Frame("Ampel");
	    AmpelTest theLight = new AmpelTest();
	    f.setLayout ( new FlowLayout() );
	    f.add(theLight);
	    f.setSize(200,300);
	    f.setVisible(true);
	    theLight.repaint();
	    while(true){
	    	theLight.repaint();
	    a1.umschalten();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	  }
	}


