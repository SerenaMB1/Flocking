package Birds;

import dF.Utils;
import drawing.Canvas;


public class randomBirds extends dynamicBird {
	

		private int speed = 100;



public randomBirds(Canvas canvas) {
		super(canvas);
		// TODO Auto-generated constructor stub
	}


public randomBirds(Canvas canvas, double xPosition, double yPosition) {
		super(canvas, xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
public void update(int time){
	int distance;
	double angle;
	double rand;
	double angularVelocity;

	
	distance = (int)(((double) time/1000) * speed);
	putPenUp();
	
	rand =  Utils.randomDouble();

	if(rand <0.8){
		angle = Utils.randomDouble();
		
		angle = Math.toDegrees(angle*Math.PI)-90;
		
		angularVelocity = angle/time;
		
		turn(angularVelocity);
	}
	
	else {
		turn(0);
	}
	
	
	move(distance);
	
	//System.out.println(time);
	
}
}


