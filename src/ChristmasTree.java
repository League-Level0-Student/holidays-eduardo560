
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ChristmasTree {

	Robot rob = new Robot();

	public static void main(String[] args) {
		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		;

	}

	private void drawStar() {
		// TODO Auto-generated method stub
		
	}

	private void drawStar() {
		// TODO Auto-generated method stub
		
	}

	void drawTreeBody() {
    	double treeWidth = 15;
      double scale = 1.1;    //This is how much the width of the tree increases with each layer down
       rob.setSpeed(100);
    	
    	// 8. Change the color of the line the robot draws to forest green    
       rob.penDown();
      rob.setPenColor(Color.green);
        // 1. Make a variable for turnAmount and set it to 175
        int turnAmount = 175;

        // 2. Start the Robot facing to the right
        rob.penUp();
        rob.turn(-180);
        for(int i = 0; i < 11; i++ ) {
        rob.turn(90);
       
        // 5. Repeat steps 3 through 11, 11 times
         for(int t11 = 0; t11 < 5; t11++ ) {

            // 3. Move the robot the width of the tree
      
			rob.move((int) treeWidth);
            // 4. Turn the robot the current turnAmount to the right
            rob.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
            treeWidth = treeWidth * scale;
          
            // 7. Move the robot the width of a tree again
            turnAmount=turnAmount -1;
            rob.move((int) treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
              rob.turn(-turnAmount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
                treeWidth = treeWidth *  1.1;
            // 11. Decrease turnAmount by 1
                treeWidth = treeWidth -1;}}

}

	void drawTreeTrunk() {
		// 1. Move the robot half the width of the tree
        rob.move(45);}
		// 2. Change the robot so that it is pointing straight down
         rob.turn(90);
		int treeWidth = 0;
		// 4. Set the pen width to the tree width divided by 10
		rob.setPenWidth((int)(treeWidth/10));
		// 5. Change the color of the line the robot draws to brown
	      rob.setPenColor(141,30,9);{
		// 3. Move the robot a quarter the tree width
          rob.move((int)(treeWidth/4));}
	

	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a
		// star.

	

}
}