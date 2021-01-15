package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	MovingPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
int counter = 10;
	public void update() {
		setX(getX()+counter);
		counter--;
		if(counter == -11) {
			counter = 10;
		}
		
	}
	
}
