package Shapes;

import java.util.Random;

public class ShapeDemo {

	public static void main(String[] args) {
		Random nums = new Random();
		Shape[] allShapes = new Shape[30];
		int shapeDecision = 0;
		int numCircle = 0, numTri = 0, numRec = 0;
		
		for(int i = 0; i < 30; i++)
		{
			shapeDecision = nums.nextInt(3);
			if(shapeDecision == 0)
			{
				allShapes[i] = new Circle();
				numCircle++;
			}
			else if(shapeDecision == 1)
			{
				allShapes[i] = new Triangle();
				numTri++;
			}
			else
			{
				allShapes[i] = new Rectangle();
			}
			
		}
		
	}

}
