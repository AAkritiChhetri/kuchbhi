/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgnew.project;

import java.util.Scanner;

/**
 *
 * @author aakri
 */
public class NewProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //step 1: take input form the user
        Scanner input = new Scanner (System.in);
     String word = input.next();
     //step 2: split char from the word and store in char[]
     char[] reverse = new char[word.length()];//hello 5
     for(int i =0;i<word.length();i++)
     {
        reverse[i] = word.charAt(i);
     }
     //step :3 read arry reverse print it
     for( int i = reverse.length-1;i>=0;i--)
     {
         System.out.print(reverse[i]);
    }
        // TODO code application logic here
    }
    
}
