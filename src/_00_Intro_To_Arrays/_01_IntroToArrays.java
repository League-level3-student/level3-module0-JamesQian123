package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] words = new String[5];
words[0] = "james";
words[1] = "iphone";
words[2] = "computer";
words[3] = "food";
words[4] = "hoodie";

        // 2. print the third element in the array
System.out.println(words[2]);
        // 3. set the third element to a different value
words[2] = "shirt";
        // 4. print the third element again
System.out.println(words[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for(int i = 0; i<words.length; i++) {
	words[i] = "blue";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i = 0; i<words.length; i++) {
	System.out.println(words[i]);
}
        // 7. make an array of 50 integers
int[] numbers = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random rand = new Random();
for(int i = 0; i <  numbers.length; i++) {
	numbers[i] = rand.nextInt(10000000);

}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallest = numbers[0];
for(int i = 1; i < numbers.length; i++) {
	
	if(numbers[i] < smallest) {
		smallest = numbers[i];
	}
}
System.out.println("The smallest is " + smallest);

        // 10 print the entire array to see if step 8 was correct
for(int i = 0; i <  numbers.length; i++) {
	System.out.println(numbers[i]);

}
        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
