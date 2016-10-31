/*
Author: Teffixily
Date: 10/31/16
Description: Beginning of the Super Computer
*/
import java.util.Scanner;

public class SuperCompTeam {
    public static void main (String[] args) {
        System.out.println ("Hello and welcome to our for loops");
        Scanner scanner = new Scanner (System.in);
        System.out.println("1) Print 100 messages saying hi");
        System.out.println("2) Sing the 100 bottles of beer song");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Print 100 messages saying hi
        for ( int t=0; t<100; t++) {
            System.out.println("Message number: "+ t +"Hi");
        }

        //Sing the beer song
        for (int t=99; t>-1; t--) {
            System.out.println(t + " bottles of beer on the wall");
            System.out.println(t + " bottles of beer");
            System.out.println("Take one down pass it around");
            System.out.println((t-1) + " bottles of beer on the wall");
        }

        // count down from 500,000 to 0
        for (int i = 500000; i >= 0; i-- ) {
            System.out.println("i== " + i);
        }

//say happy halloween 994 times
        for (int m = 0; m <= 994; m++) {
            System.out.println("Happy Halloween ");
        }

//Count down fron 100,000 to 0
        for (int i = 100000; i >=0; i--) {
            System.out.println("i == " +i);
        }
//Say "Spooky Scary Skeletons a 100,000 times
        for (int i = 100000; i <= 1000000; i++) {
            System.out.println("Spooky Scary Skeletons ");
        }
//Count up from 0 to 100,000
        for (int i = 0; i <= 100000; i++) {
            System.out.println("i == " +i);
        }

    }
}
