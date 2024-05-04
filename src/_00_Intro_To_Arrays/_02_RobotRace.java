package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method

	public static void main(String[] args) {
		int x = 100;
		Random rand = new Random();
		Robot[]robots = new Robot[5];
//		for(Robot r: robots) {
//			r = new Robot();
//			
//		
//		}
//		for(int i = 0; i < 5; i++) {
//			Robot rob = new Robot();
//			robots[i] =  rob;
//			rob.setX(x);
//			rob.setY(600);
//			x+=200;
//			rob.setSpeed(25);
//		}
		int winner;
		boolean moving = true;
//		while(moving) {
//			for(int i = 0; i < robots.length; i++) {
//				robots[i].move(rand.nextInt(50));
//				int y = robots[i].getY();
//				if(y < 0) {
//					moving = false; 
//					winner = i;
//					JOptionPane.showMessageDialog(null, "Robot " + winner + "won the race");
//				}
//			}
//		}
//		
		for(int i = 0; i < 5; i++) {
			Robot rob = new Robot();
			robots[i] =  rob;
			rob.setX(x);
			rob.setY(300);
			x+=100;
			rob.setSpeed(25);
		}
		while(moving) {
			for(int i = 0; i < robots.length; i++) {
				robots[i].move(rand.nextInt(100));
				robots[i].turn(20);
				int y = robots[i].getY();
				if(y == 300 ) {
					moving = false; 
					winner = i;
					JOptionPane.showMessageDialog(null, "Robot " + winner + "won the race");
				
				}
			}
		}
	}
	}
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
	


