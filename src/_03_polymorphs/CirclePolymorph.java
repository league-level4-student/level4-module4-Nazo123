package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{

	CirclePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
double counter = 0;
	public void update() {
		counter = counter + 1;
		setX((int) (getX()+Math.cos(counter)*100));
		setY((int) (getY()+Math.sin(counter)*100));
	}
	
}
