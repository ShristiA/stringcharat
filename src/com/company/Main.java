package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	// creating class from Scanner object
        System.out.println("enter a word" );
        String word = src.next();
        System.out.println("enter a number as an index");
        int index = src.nextInt();
// asking and storing the inputs in variable word and index
        System.out.println("your word length is " + word.length());
        //pulling.length method to our variable "word" to get the count of word and printing it out
         if(word.length() < index){
           System.out.println("Index is larger than length");
           //entering a condition to check if the index is greater than the word length, it would print out the following result
        }else{
             System.out.println("your substring starting from 0 to " +  index + " is "  + word.substring(0 ,index + 1));
             //else it will just print the words till the index.
         }


    }
}
