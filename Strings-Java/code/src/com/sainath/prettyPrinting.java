package com.sainath;

public class prettyPrinting {
    public static void main(String[] args) {

        //you want to print till two digit after decimal point.
        //Note : at the time of printing formatted value then user the printf() rather than println().
        //this %number.f (number --> how many digits want after decimal point).
        // it rounds Off and format the number.
        float a = 453.12342223453356f;
        System.out.printf("Formatted a is : %.2f" , a);

        //here done formatting as well as Rounds Off also to b.
        float b = 435.1274f;
        System.out.printf("\n Formatted b is : %.2f \n" , b);


        System.out.println(Math.PI); //3.141592653589793
        System.out.printf("pie : %.3f" , Math.PI);

        //adding a string inside string to format string by using %s.
        //In which order the placeholders (%s) are hold in that order hold the variables (sainath wankhede,sitlonavala).
        System.out.printf("\nHello my name is %s . I am a student of %s","Sainath Wankhede","SIT,Lonvala");

       // examples of format specifiers.
        System.out.printf("%d", 10); //10
        System.out.printf("%f", 10.1); //10.100000
        System.out.printf("%c", 'a'); //a
        System.out.printf( "%C", 'a'); //A
        System.out.printf("%s", "hello"); //hello
        System.out.printf("%S", "hello"); //HELLO
        System.out.printf("%b", 5 < 4); //false
        System.out.printf("%B", 5 < 4); //FALSE
        System.out.printf("%b", null); //false
        System.out.printf("%b", "cow"); //true




    }
}
