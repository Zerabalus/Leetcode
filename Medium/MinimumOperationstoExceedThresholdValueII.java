package Medium;
import java.util.PriorityQueue;

/* You are given a 0-indexed integer array nums, and an integer k.

In one operation, you will:

    Take the two smallest integers x and y in nums.
    Remove x and y from nums.
    Add min(x, y) * 2 + max(x, y) anywhere in the array.

Note that you can only apply the described operation if nums 
contains at least two elements.

Return the minimum number of operations needed so that all elements of
the array are greater than or equal to k. */


public class MinimumOperationstoExceedThresholdValueII {
    public int minOperations(int[] nums, int k) {
        //inicializamos la variable de conteo
        int conteo = 0;
        //creamos una cola de prioridad (mini monticulo) para obtener los valores más peques
        PriorityQueue<Long> cola = new PriorityQueue<>();
        //llenamos la cola con los elementos de input array
        for (int x : nums) {
            cola.offer((long) x);
        }

        //el loop continua mientras la cola tenga al menos dos elementos en el monticulo
        while (cola.size() >= 2) {
            //reviwsa si el elemento en la cabeza de la cola es mayor o igual a k
            //si lo es, se retorna el conteo
            if (cola.peek() >= k) {
                return conteo;
            }
            //incrementamos el conteo
            conteo++;

            //sacamos los dos primeros elementos de la cola
            long x = cola.poll();
            long y = cola.poll();

            //agregamos el doble del menor y el mayor a la cola
            // min(x, y) * 2 + max(x, y) y se agrega el resultado al monticulo
            cola.offer(x * 2 + y);
        }
        
        //si el loop termina devuelvemos el conteo
        //si el loop finalizo, significa los elementos en el arreglo son mayores o iguales a k
        return conteo;
    }
}
