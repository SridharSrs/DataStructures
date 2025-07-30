// ----------------------------------------------
//      Java Programs on Digit Manipulations
//-----------------------------------------------

public class DigitOperations {

    // Q1: Count the number of digits in a given number
    public static void countDigits(int n) {
        /*
         * Explanation:
         * We keep dividing the number by 10 until it becomes 0.
         * Each division removes the last digit.
         * Count how many times this happens to find the total number of digits.
         */
        int count = 0;
        while (n != 0) {
            n /= 10; // n = n / 10
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    // Q2: Find the sum of digits of a number
    public static void sumOfDigits(int n) {
        /*
         * Explanation:
         * We extract the last digit using modulus (%10) and add it to the sum.
         * Then remove the last digit using integer division.
         */
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Q3: Find the product of digits of a number
    public static void productOfDigits(int n) {
        /*
         * Explanation:
         * Similar to sum, we extract each digit and multiply it to a running product.
         */
        int product = 1;
        while (n != 0) {
            int temp = n % 10;
            product *= temp;
            n /= 10;
        }
        System.out.println("Product of digits: " + product);
    }

    // Q4: Find the difference between the product and the sum of digits
    public static int subtractProductAndSum(int n) {
        /*
         * Explanation:
         * We calculate the product and the sum in the same loop.
         * Finally, return product - sum.
         */
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            product *= temp;
            n /= 10;
        }
        return product - sum;
    }

    // Q5: Find the sum of even digits only
    public static void sumOfEvenDigits(int n) {
        /*
         * Explanation:
         * Extract each digit and check if it is even.
         * If yes, add it to the sum.
         */
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp % 2 == 0) {
                sum += temp;
            }
            n /= 10;
        }
        System.out.println("Sum of even digits: " + sum);
    }

    // Q6: Find the difference between the product of even and odd digits
    public static void differenceEvenOddProduct(int n) {
        /*
         * Explanation:
         * Separate digits into even and odd.
         * Calculate their individual products and subtract them.
         */
        int evenProduct = 1;
        int oddProduct = 1;
        boolean hasEven = false;
        boolean hasOdd = false;

        while (n != 0) {
            int temp = n % 10;
            if (temp % 2 == 0) {
                evenProduct *= temp;
                hasEven = true;
            } else {
                oddProduct *= temp;
                hasOdd = true;
            }
            n /= 10;
        }

        if (!hasEven) evenProduct = 0; // if no even digits
        if (!hasOdd) oddProduct = 0;   // if no odd digits

        int difference = evenProduct - oddProduct;
        System.out.println("Difference (Even Product - Odd Product): " + difference);
    }

    // Q7: Count the frequency of a given digit in a number
    public static void frequencyOfDigit(int n, int target) {
        /*
         * Explanation:
         * Traverse each digit and count how many times it matches the target digit.
         */
        int count = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp == target) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Frequency of digit " + target + ": " + count);
    }

    // Main method to run all questions
    public static void main(String[] args) {
        int number = 12334456;
        int smallNumber = 1233;

        System.out.println("Q1: Count the number of digits in " + number);
        countDigits(number);

        System.out.println("\nQ2: Find the sum of digits in " + number);
        sumOfDigits(number);

        System.out.println("\nQ3: Find the product of digits in " + smallNumber);
        productOfDigits(smallNumber);

        System.out.println("\nQ4: Subtract product and sum of digits in 234");
        System.out.println("Result: " + subtractProductAndSum(234));

        System.out.println("\nQ5: Sum of even digits in " + smallNumber);
        sumOfEvenDigits(smallNumber);

        System.out.println("\nQ6: Difference between product of even and odd digits in " + smallNumber);
        differenceEvenOddProduct(smallNumber);

        System.out.println("\nQ7: Frequency of digit 3 in " + smallNumber);
        frequencyOfDigit(smallNumber, 3);
    }
}
