import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("input a string and a character ");
        Scanner input = new Scanner(System.in);
        String ourString = input.next();
        char ourChar = input.next().charAt(0);
        String result = myConvert(ourString,ourChar);

        System.out.println("Result: "+result);
    }

    public static String myConvert(String myString, Character myChar) {

        StringBuilder mysb = new StringBuilder(myString);// I used String Builder to use set char property

        if(isUpperCase(myChar)){
            for(int i=0; i<myString.length(); i++){
               if( myString.charAt(i) == myChar) {
                   mysb.setCharAt(i,toLowerCase(myChar));
               }
                else if( myString.charAt(i) == toLowerCase(myChar)){
                    ;
                }

            }
        }
        else if(isLowerCase(myChar)){
            for(int i=0; i<myString.length(); i++){
                if( myString.charAt(i) == myChar) {
                   mysb.setCharAt(i,toUpperCase(myChar));
                }
                else if( myString.charAt(i) == toUpperCase(myChar)){
                    ;
                }
            }

        }
        myString=mysb.toString();
        return myString;
    }

}
