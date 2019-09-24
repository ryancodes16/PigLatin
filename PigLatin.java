/**
 * PigLatin.java
 *
 * Program to generate a Pig Latin expression 
 * consisting of any number of words
 *
 * @author Ryan Regier
 * Wheaton College, CSCI 235, Fall 2019
 * Project 1
 * Date? 09/13/2019
 */
import java.util.*;

public class PigLatin {

    public static void main(String[] args) {

        //for input from keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter words: ");

        //store input at str
        String str = keyboard.nextLine();

        //remove leading and trailing spaces
        str = str.trim();  

        //hold pig latin expression up to this point
        String pig = "";

        //add your code here

        //create and initialize some variables
        String temp = "";
        String newWord = ""; 
        int pos = 0;
        int numOfWords = 1;

        //calculate how many words to then make array size
        for(int x = 0; x < str.length(); x++){
            if(str.charAt(x) == ' '){
                numOfWords++;
            }
        }

        //create array to hold each word
        String words[] = new String[numOfWords];

        //separate the words into an array
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                words[pos] = temp;
                temp = "";
                pos++;
            } else {
                temp += str.charAt(i);
            }
        }
        words[pos] = temp;

        //loops through array of each word to translate each word to pig latin and then add it to the string pig that will contain entire pig latin phrase
        for(int i = 0; i < words.length; i++){
            newWord = "";
            if(words[i].length() > 1){
                for(int k = 1; k < words[i].length(); k++){
                    newWord += words[i].charAt(k);
                }
                newWord += (words[i].charAt(0) + "ay ");
            } else {
                newWord = words[i] + "ay ";
            }
            pig += newWord;
        }

        //print pig latin expression at pig
        System.out.println("The Pig Latin expression: " + pig);

    }
}
