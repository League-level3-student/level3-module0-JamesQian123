package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] words = new String[5];
	words[0] = "hello";
	words[1] = "cup";
	words[2] = "jacket";
	words[3] = "blue";
	words[4] = "square";
	printAllStringsInArray(words);
	String[] hello = new String[5];
	hello[0] = "hello";
	hello[1] = "cup";
	hello[2] = "jacket";
	hello[3] = "blue";
	hello[4] = "square";
	printAllStringsInArrayBackwards(hello);
	
}
	
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
public static void printAllStringsInArray(String[] words) {
	for(String w: words) {
		System.out.println(w);
	}
	
	
	
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
public static void printAllStringsInArrayBackwards(String[] hello) {
	for(int i = hello.length - 1; i >= 0 ; i--) {
		System.out.println(hello[i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
public static void printEveryOtherStringInTheArray(String[] strings) {
	for(int i = 0; i < strings.length; i+=2) {
		System.out.println(strings[i]);
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
public static void printAllOfTheStringsInARandomOrder(String[] values) {
	
}
}

