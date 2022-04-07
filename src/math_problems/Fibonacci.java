package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args){
        int highestValue = 40;
        int firstValue= 0;
        int secondValue = 1;
        System.out.print ("Fibonacci series of " +highestValue+" numbers:");

        for (int i =1; i<=highestValue; i++)
        {
            System.out.print(firstValue+" ");

            int totalValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = totalValue;

        }

    }


}
