package Entities;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public boolean right, left;
	public int x,y;
	
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void tick() {
		if (right) {
			x++;
		}
		else if (left) {
			x--;
		}
	}
	
	public void render (Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 40, 10);
	}
	
}
