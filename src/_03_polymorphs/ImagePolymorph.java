package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	BufferedImage image;
	ImagePolymorph(int x, int y) {
		super(x, y);
		try {
			 image = ImageIO.read(this.getClass().getResourceAsStream("Tree.png"));;
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}


	@Override
	public void draw(Graphics g) {
		
		g.drawImage(aee, getX(), getY(), getWidth(), getHeight(), null);
	}
	
}
