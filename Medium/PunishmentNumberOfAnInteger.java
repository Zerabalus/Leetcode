package Medium;

/* Given a positive integer n, return the punishment number of n.

The punishment number of n is defined as the sum of the squares of all integers i such that:

    1 <= i <= n
    The decimal representation of i * i can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals i.
 */

public class PunishmentNumberOfAnInteger {
    public int punishmentNumber(int n) {
        // para almacenar el numero
        int punishmentNum = 0;

        // atravesar el array
        for (int curr = 1; curr <= n; curr++) {

            // encontrar el cuadrado
            int square = curr * curr;

            if (canPartition(square, curr))
                punishmentNum += square;
        }

        return punishmentNum;

    }

    public boolean canPartition(int num, int target) {
        // invalido
        if (num < target || target < 0)
            return false;

        if (num == target)
            return true;

        return (canPartition(num / 10, target - (num % 10)) || canPartition(num / 100, target - (num % 100))
                || canPartition(num / 1000, target - (num % 1000)));
    }
}
