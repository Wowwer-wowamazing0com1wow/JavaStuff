package GameSnake;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Entity {
		private int x,y,size;
		
		public Entity(int size){
			this.size = size;
		}
		
		public int GetX(){
			return x;
		}
			
		public int GetY(){
			return y;
		}
		
		public void SetX(){
			this.x = x;
		}
		
		public void SetY(){
			this.y = y;
		}
		
		public void SetPosition(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public void Movement(int dx, int dy){
			x = dx;
			y = dy;
		}
		
		public Rectangle GetBound(){
			return new Rectangle(x,y,size,size);
		}
		
		public boolean isCollision(Entity o){
			if (o == this)return false;
			return GetBound().intersects(o.GetBound());
		}
		
		public void render(Graphics2D g2d){
			g2d.fillRect(x + 1 ,y + 1 ,size - 2 ,size - 2);
		}
}
