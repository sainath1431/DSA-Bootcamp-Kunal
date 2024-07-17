package com.sainath;

public class Comparison {

    /*
    Comparison of Strings :

    -There are two way's :
    1) Comparator Operator (==)
    2) str1.equals(str2) method

    1)Comparator Operator (==) :

        case 1: a-----> "kunal";
                b-----> "Kunal";

                In this case  ==  will give fasle

        case 2 : a-----> "Kunal" <------b

                 In this case == will give true.

        Note :

        == Operator Checks the both values and Reference Variables. and
        If Reference Variables are pointing to the same objects with same value then ( == ) returns 'True'.
        If Reference Variables are pointing to the different objects with same value then ( == ) return 'Fasle'.


     2) str1.equal(str2) Method.

        Note:

        When you only need to check values, uses .equals method.



     */

    public static void main(String[] args) {
        

        // Comparator Operator


        //This are strings inside the String Pool because the value is same.
        String a = "kunal";
        String b = "kunal";
        String e = a;
//        System.out.println(e); // true

        //To prove the above strings are inside String Pool.
        //We used (==) Comparator Operator.

//        System.out.println(a == b); //true

        //How to create different objects of same value.
        //By using new Keyword.
        //Below Object values are creating outside the String Pool but inside heap memory.
        //Internal Representation
        //                c ---> "kunal"
        //                d ---> "kunal" This values are stored outside pool and inside heap memory.


        String c = new String("kunal");
        String d = new String("kunal");

        boolean compare = ( c == d ); //Here value of string are same but reference variables are pointing to different objects.
//        System.out.println(compare); //false (reference variables are pointing to the different objects.

        String name1 = new String("kunal");
        String name2 = new String("kunal");
//        System.out.println(name1 == name2); //false  // Here used Comparator Operator (==) so Must need the values are same and reference variable pointing to same value then only true.
                                                       // Otherwise false.
                                                       // here name1 ---> kunal
//                                                    //       name2 ---> kunal
                                                      //       name 1 and name 2 both reference variable pointing to the different object values so it will false.

        System.out.println(name1.equals(name2));//true //Here used .equals() method which checks only object values are same or not if the object value same return true otherwise return false.
                                                       // Not Require the reference variables are pointing to the same object value
                                                       // here name1 ---> kunal
                                                       //      name2 ---> kunal
                                                       //      name 1 and name 2 pointing to same values of different Object so it return true. if values are different then it will false.

       //System.out.println(name1[0]); // can't do this.

        //To Access the value at any index by using charAt(index) method.


        String college = "Sinhgad";

        System.out.println("character accessing inside string using index : ");
        System.out.println(college.charAt(0)); //0th index
        System.out.println(college.charAt(1)); //1st index
        System.out.println(college.charAt(2)); //2nd index
        System.out.println(college.charAt(3)); //3rd index
        System.out.println(college.charAt(4)); //4th index
        System.out.println(college.charAt(5)); //5th index
        System.out.println(college.charAt(6)); //6th index

        System.out.println("Character accessing inside string using for loop : ");
        for (int i = 0; i < college.length(); i++) {
            System.out.print(college.charAt(i) + "\t");
        }

    }


}
