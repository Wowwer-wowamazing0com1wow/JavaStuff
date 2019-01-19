package GameSnake;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener {

	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;
	private final int size = 10;
	
	private Graphics2D g2d;
	private BufferedImage image;
	
	private Thread thread;
	private Boolean Running = true;
	private long TargetTime;
	
	Entity Head;
	ArrayList<Entity> snake;
	
	public void GamePanel() {
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}
	
	public void addNotify(){
		super.addNotify();
		thread = new Thread(this);
		thread.start();
	}
	
	private void setFPS(int fps) {
		TargetTime = 1000/fps;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyTypedW(KeyEvent w) {

	}

	public void keyTypedS(KeyEvent s) {

	}

	public void keyTypedA(KeyEvent a) {

	}
	
	public void keyTypedD(KeyEvent d) {

	}
	
	public void run() {
		if(Running) return;
		  init();
		  long startTime;
		  long elapsed;
		  long wait;
		  while(Running){
		   startTime = System.nanoTime();
		   
		   update();
		   requestRender();
		   
		   elapsed= System.nanoTime() - startTime;
		   wait = TargetTime - elapsed / 1000000;
		   if(wait > 0) {
		    try {
		     Thread.sleep(wait);
		    }catch(Exception e) {
		     e.printStackTrace();
		    }
		   }
		  }
		
	}
	
	public void init() {
		image = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_ARGB);
		g2d = image.createGraphics();
		Running = true;
		setUpLvl();
		setFPS(10);
	}
	
	private void setUpLvl(){
		snake = new ArrayList<Entity>();
		Head = new Entity(size);
		Head.SetPosition(WIDTH/2 ,HEIGHT/2);
		snake.add(Head);
		
		for(int i = 1; i < 10; i++){
			Entity e = new Entity (size);
			e.SetPosition(Head.GetX() + (i * size), Head.GetY() );
			snake.add(e);
		}
	}
	
	private void requestRender() {
		render(g2d);
		Graphics g = getGraphics();
		g.drawImage(image ,0 ,0 ,null);
		g.dispose();
	}

	private void update() {

		
	}
	
	public void render(Graphics2D g2d){
		g2d.clearRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.GREEN);
		for(Entity e : snake){
			e.render(g2d);
		}
	}
	
	

	

}
