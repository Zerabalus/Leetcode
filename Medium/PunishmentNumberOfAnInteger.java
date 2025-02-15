package Medium;

/* Given a positive integer n, return the punishment number of n.

The punishment number of n is defined as the sum of the squares of all integers i such that:

    1 <= i <= n
    The decimal representation of i * i can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals i.
 */

/*  Dado un número nn, queremos encontrar la suma de los cuadrados de ciertos números desde 11 hasta nn, pero solo de aquellos números que cumplen una condición especial.
Condición especial:

Si tomamos el cuadrado de un número, debe ser posible dividir sus dígitos en segmentos cuya suma sea igual al número original. */

public class PunishmentNumberOfAnInteger {
    public int punishmentNumber(int n) {
        // para almacenar el numero
        int punishmentNum = 0;

        // Recorremos los números del 1 hasta n
        for (int testNumber = 1; testNumber <= n; testNumber++) {

            // encontrar el cuadrado
            int square = testNumber * testNumber;

            // Si es válido, sumamos el cuadrado al resultado final
            if (canPartition(square, testNumber))
                punishmentNum += square;
        }

        return punishmentNum;

    }

    // Función que verifica si podemos dividir num en partes que sumen target
    public boolean canPartition(int num, int target) {
        // Si el número es menor que el objetivo o el objetivo es negativo, no es válido
        if (num < target || target < 0)
            return false;

        // Si el número es igual al objetivo, significa que encontramos una forma válida
        if (num == target)
            return true;

        // Intentamos dividir el número en diferentes segmentos y verificamos si alguno
        // funciona
        return (canPartition(num / 10, target - (num % 10)) || // Tomamos el último dígito
                canPartition(num / 100, target - (num % 100)) || // Tomamos los últimos dos dígitos
                canPartition(num / 1000, target - (num % 1000))); // Tomamos los últimos tres dígitos
    }
}
