package Testing;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.KeyboardFocusManagerPeer;
import java.util.concurrent.TimeUnit;

public class ButtonTesting implements KeyboardFocusManagerPeer, KeyListener, Runnable, MouseListener {

	public static double MouseX = 0;
	public static double MouseY = 0;
	public static int Enough = 0;
	public static Point PointMouse = MouseInfo.getPointerInfo().getLocation();
	
	public static void main(String[] args) throws InterruptedException{
		while (Enough < 100){
			PointMouse = MouseInfo.getPointerInfo().getLocation();
			MouseX = PointMouse.getX();
			MouseY = PointMouse.getY();
			
			System.out.println(MouseX +" " + MouseY + PointMouse);
			if (MouseX <= 1600 && MouseX >= 300 && MouseY >= 100 && MouseY<= 1000){
				System.out.println("In Area");
			}
			TimeUnit.MILLISECONDS.sleep(500);
			Enough++;
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
		return;
	}
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Entered");

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Pressed");

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearGlobalFocusOwner(Window arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getCurrentFocusOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window getCurrentFocusedWindow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCurrentFocusOwner(Component arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCurrentFocusedWindow(Window arg0) {
		// TODO Auto-generated method stub

	}
	
	

}
