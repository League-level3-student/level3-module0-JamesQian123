package _03_Intro_to_2D_Arrays;

import java.util.Random;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
    	Random rand = new Random();
    	
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int[][] new2DArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        for(int i = 0; i<new2DArray.length; i++) {
        	for(int j = 0; j < new2DArray[i].length; j++) {
        		int value = rand.nextInt(50);
        		new2DArray[i][j] = value;
        		
        	}
        }
        	
        // 3. print the third element from the second 1D array (2DArray[1][2])
        System.out.println(new2DArray[1][2]);
        
        // 4. set the third element from the second 1D array to a different
        //    value
        new2DArray[1][2] = 50;
        // 5. print the element again and verify the value has changed
        System.out.println(new2DArray[1][2]);
    }
}
