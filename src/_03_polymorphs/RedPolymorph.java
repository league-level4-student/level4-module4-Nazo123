package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	RedPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void a(int q, int w) {
		// TODO Auto-generated method stub
		
	}
	
}
