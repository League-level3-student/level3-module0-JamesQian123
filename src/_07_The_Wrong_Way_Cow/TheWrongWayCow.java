/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.ArrayList;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	//j is col, i is row
    	int counter = 0;
    	ArrayList<int[]> cowsToTheRight = new ArrayList<int[]>();
    	ArrayList<int[]> cowsToTheLeft = new ArrayList<int[]>();
    	ArrayList<int[]> cowsThatAreDown = new ArrayList<int[]>();
    	ArrayList<int[]> cowsThatAreUp = new ArrayList<int[]>();
    	
    	//right
    	
    	for(int i = 0; i < field.length; i++) {
    		for(int j = 0; j < field[i].length - 2; j++) {
    			if(field[i][j] == 'c' && field[i][j+1] == 'o' && field[i][j+2] == 'w') {
    				int[] places = new int[2];
    				places[0] = j;
    				places[1] = i;
    				cowsToTheRight.add(places);
    			}
 
    			
    		}
    	}
    	// left
    	for(int i = 0; i < field.length; i++) {
    		for(int j = 2; j < field[i].length; j++) {
    			if(field[i][j] == 'c' && field[i][j-1] == 'o' && field[i][j-2] == 'w') {
    				int[] places = new int[2];
    				places[0] = j;
    				places[1] = i; 
    				cowsToTheLeft.add(places);
    				
    			}
    			
    		}
    	}
    	//up
    	for(int i = 2; i < field.length; i++) {
    		for(int j = 0; j < field[i].length; j++) {
    			if(field[i][j] == 'c' && field[i -1][j] == 'o' && field[i-2][j] =='w') {
    				int[] upPlaces = new int[2];
    				upPlaces[0] = j; 
    				upPlaces[1] = i; 
    				cowsThatAreUp.add(upPlaces);
    				
    			}
    			
    		}
    	}
    	//down
    	for(int i = 0; i < field.length -2;i++) {
    		for(int j = 0; j < field[i].length; j++) {
    			if(field[i][j] == 'c' && field[i +1][j] == 'o' && field[i+2][j] == 'w') {
    				int[] downPlaces = new int[2];
    				downPlaces[0] = j; 
    				downPlaces[1] = i; 
    				cowsThatAreDown.add(downPlaces);
    			}
    			
    		}
    	}
    	if(cowsToTheRight.size() == 1) {
    		return cowsToTheRight.get(0);
    	}
    	else if(cowsToTheLeft.size() == 1) {
    		return cowsToTheLeft.get(0);
    	}
    	else if(cowsThatAreUp.size() == 1) {
    		return cowsThatAreUp.get(0);
    	
    	}
    	else if(cowsThatAreDown.size() == 1) {
    		return cowsThatAreDown.get(0);
    	}
        
        return null;
    }
}
