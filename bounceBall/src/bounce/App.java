/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounce;

/**
 *
 * @author eyami
 */
import javax.swing.*;
public class App extends JFrame{
    private static DrawingPanel dpanel;
	
	public App(){
		setTitle("Jumping balls");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dpanel = new DrawingPanel();
		add(dpanel);
	}
	
	public static void main(String [] a) throws InterruptedException{
		
		new App();
		while(true){
		dpanel.move();
		dpanel.repaint();
		Thread.sleep(10);
		}
    
    }
}