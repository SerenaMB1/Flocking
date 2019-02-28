package drawing;


import drawing.Canvas;
import geometry.CartesianCoordinate;

public class birds {
		
		CartesianCoordinate position;
		int angle=0;
		boolean isPenDown;
		Canvas myCanvas;
		public CartesianCoordinate pos; 
		

public birds(Canvas myCanvas) {
		this.myCanvas = myCanvas;
		pos = new CartesianCoordinate(0,0);
		isPenDown = false; 
	
			
		}
public void move(double i) {
		double newX;
		double newY;
			
		newX =  (pos.getX() + i*Math.cos(Math.toRadians(angle)));
		newY =  (pos.getY() + i*Math.sin(Math.toRadians(angle)));
			
			
		if(isPenDown == true){
			myCanvas.drawLineBetweenPoints(pos, new CartesianCoordinate(newX,newY));
		}
			pos = new CartesianCoordinate(newX,newY);
		}

public void turn(double i) {

			
		angle += i;
		if(angle<0) angle+=360;
		if(angle>360) angle-=360;
		
	 
		}

public void putPenUp() {
		isPenDown = false;		
		}

public void putPenDown() {
			isPenDown = true;

		}

public void undraw(){
			
			
		for(int i = 0; i < 4; i++){
			myCanvas.removeMostRecentLine();
		}
			
			myCanvas.repaint();
			
	}
			

}

