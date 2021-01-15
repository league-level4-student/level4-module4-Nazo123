package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class MousePolymorph extends Polymorph implements MouseMotionListener{
	MousePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
	
	
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print(e.getX()+", "+e.getY()+"");
		if(e.getX()>=getX()&&e.getX()<=getX()+getWidth()&&e.getY()>=getY()&&e.getY()<=getY()+getHeight()) {
			JOptionPane.showMessageDialog(null, "Please stop clicking on me :(");
		}
	}
	
}
