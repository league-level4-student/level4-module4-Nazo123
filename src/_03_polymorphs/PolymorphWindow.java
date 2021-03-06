package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
   ArrayList<Polymorph> polys = new ArrayList<Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    polys.add(new RedPolymorph(0,0));
    polys.add(new BluePolymorph(50,0));
    polys.add(new MovingPolymorph(100,0));
    polys.add(new CirclePolymorph(200,200));
    polys.add(new ImagePolymorph(400,400));
    polys.add(new MousePolymorph(300,300));
    polys.add(new TalklingPolymorph(0,200));
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   for(int i = 0; i < polys.size();i++) {
	   polys.get(i).draw(g);
   }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	  for(int i = 0; i < polys.size();i++) {
    		  if(polys.get(i) instanceof MousePolymorph || polys.get(i) instanceof TalklingPolymorph) {
    
    		  }else {
    			  polys.get(i).update();
    		  }
    		 
    	   }
   	 repaint();
   
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		try{
	polys.get(5).a(e.getX(),e.getY());
	polys.get(6).a(e.getX(),e.getY());
	}
		catch(Exception e1) {
			
		}
}
}
