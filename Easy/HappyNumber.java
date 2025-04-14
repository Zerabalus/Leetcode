package Easy;
/* 
* Write an algorithm to determine if a number n is happy.
*
* A happy number is a number defined by the following process:
*
*    Starting with any positive integer, replace the number by the sum of the squares of its digits.
*    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a 
*    cycle which does not include 1.
*    Those numbers for which this process ends in 1 are happy.
*
* Return true if n is a happy number, and false if not.
*
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        if (n < 10) {
            return false;
        }

        int sumaCuadrados = 0;
        while (n > 0) {
            int numero = n % 10;
            sumaCuadrados += numero * numero;
            n /= 10;
        }

        return isHappy(sumaCuadrados);
    }
}
