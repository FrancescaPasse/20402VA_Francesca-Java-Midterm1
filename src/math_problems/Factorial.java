package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        int fact = 5;
        long factorial = factorialNumbers(fact);
        System.out.println("Factorial of " + fact + " = " + factorial);
    }

    public static long factorialNumbers(int fact)
    {
        if (fact >=1)
            return fact * factorialNumbers (fact -1);
        else
            return 1;


 }

 }







