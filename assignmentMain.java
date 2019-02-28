

import javax.swing.JFrame;

import Birds.randomBirds;
import dF.Utils;

import java.util.ArrayList; 

import drawing.Canvas;


public class assignmentMain {
	public double x = 100.0;
	public double y = 100.0;
	int deltaTime = 20;
	double addX;
	double addY;
	
	ArrayList<randomBirds> birds; 
	
	public assignmentMain() {
		 JFrame frame = new JFrame();
		 Canvas canvas = new Canvas();
		 frame.setTitle("Turtle Frame");
		 frame.setSize(800, 600);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.add(canvas);
		 
		// DynamicTurtle myTurtle = new DynamicTurtle(canvas, x, y);
		 
		 ArrayList<randomBirds> birds = new ArrayList<randomBirds>();
		
		 for (int i  = 0; i < 30; i++){
			 
			 addX = (Utils.randomDouble())*500;
			 addY = (Utils.randomDouble())*500;
			 
			 birds.add(new randomBirds(canvas, (x+(int)addX), (y+(int)addY)));
			 
			System.out.println("dynamic" + addY);
			 
		 }
 
	

		 // milliseconds
		 
		 boolean continueRunning = true;
		 // game loop
		 while (continueRunning) {
			 
			 Utils.pause(deltaTime);
		
			 
			 for (randomBirds s : birds) {
		         s.undraw();
			 }
			 
			 for (randomBirds s : birds) {
				 
		         s.update(deltaTime);
			 }
			
			 for (randomBirds s : birds) {
				 s.draw();
				 //System.out.println(s);
				 }

		 }
 } 

	public static void main(String[] args) {
		new assignmentMain(); 

	}

}