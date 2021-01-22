package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class TalklingPolymorph extends Polymorph{
	TalklingPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update(int x, int y) {
		
		
	}

	@Override
	public void a(int q, int w) {
		System.out.println(q+", "+w+"");
		if(q>=getX()&&q<=getX()+getWidth()&&w>=getY()&&w<=getY()+getHeight()) {
			JOptionPane.showMessageDialog(null, "Please stop clicking on me :(");
		}
	
	}


	
	}
	

