package math_problems;

import java.sql.SQLOutput;

public class Pattern {

    /**
     * INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     * <p>
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     */
    // 100=90=10 (1)
    // 90-70=20 (2)
    // 70-40=30 (3)
    // 40-0 = 40 (4)

    public static void main (String[] args){
        int value= 100;
        int firstNumber =1;
        int secondNumber =1;
        while (value>=0){
            System.out.print(value + " ");
            value -=secondNumber;
            firstNumber++;
            if (firstNumber ==11) {
                firstNumber=1;
                secondNumber++;


            }
        }
    }

}



