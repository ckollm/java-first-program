package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) { return 2*number; }

    private static int add(int numbers[]) {


        int sum = 0;

        /* Then, using a for loop over numbers
        (or using a while loop), add every item in the numbers array to the sum variable. */

        int count = 1 ;
        while ( count <= numbers.length )
        {
            sum = sum + numbers[count];
            count++ ;
        }

        return sum; }

}
