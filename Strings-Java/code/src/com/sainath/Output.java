package com.sainath;

import java.util.Arrays;

public class Output {

    public static void main(String[] args) {

        /*
        function overloading is done on println :

        Same name of println() method work for different type of data.
        such concept is called as function/method overloading.


        Anything you print in println() you calls the tostring() method.


         */

        //this println taking integer.
        //then convert into string by using Integer.tostring(i) method.
        System.out.println(56); //56
        //out --> reference variable of type PrintStream(Class).
        //println --> method of PrintStream class.
        //By using out reference variable we call to println method of PrintStream class.

        //By using Wrapper Class we can convert Integer into String.
        //In this time tostring() is inside the Integer Wrapper Class.
        //Integer num = new Integer(56);
        //System.out.println(num.toString());

        //this println taking string.
        System.out.println("sainath"); //sainath

        //this println taking object type.
        //below code give hashcode with some characters which are not
        //understand by human.
        System.out.println(new int[] {2,3,4,45,56,7}); //[I@7b23ec81

        //so, to make understandable output of object (array) we are override
        //the obj.tostring() by Array.tostring() so we get beautiful output rather than
        //hashcode.

        System.out.println(Arrays.toString(new int[] {2,3,4,5,6}));
        //[2, 3, 4, 5, 6] String in Array representation.

        String name = null;
        System.out.println(name);//println() method passes null so that it directly print null.




    }
}
