package Main;

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject {

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);
		
		velX=5;
		velY=5;
		
		
	}

	@Override
	public void tick() {
		x+=velX;
		y+=velY;
			
		if(y<0 || y>= Game.HEIGHT - 50) velY *= -1;
		if(x<0 || x>= Game.WIDTH - 28) velX *= -1;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
	}

	
	
}
