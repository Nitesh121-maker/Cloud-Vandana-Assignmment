//Java Progrom For folowing functionality
//i. It should ask the user 2 inputs:
//1. Enter a Sentence (any English sentence)
//2. Enter a Letter (any letter from A to Z)
//ii. On clicking on “Submit” button it should output the rest of the sentence after the first 
//occurrence of the letter in the sentence
//iii. If the letter does not exist in the sentence, output -> “The letter does not exist in the sentence”.
//iv. Example 1
//1. Sentence: Hello World!
//2. Letter: r
//3. Result: ld!
import java.util.*;
public class Assignment3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //Java Scanner Clsss
        System.out.print("Enter the String=");
        String str=sc.nextLine();
        System.out.print("Enter the Sub-String=");
        String Substr=sc.nextLine();
        int index = str.indexOf(Substr);
        if(index == -1){
            System.out.println("The letter does not exist in the sentence");//Alert Statement
        }else{
            System.out.println("Result => "+str.substring(index+1));
        }
    }
}
