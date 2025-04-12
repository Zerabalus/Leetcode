package Easy;

import java.util.HashMap;
import java.util.Map;

/* 
* Given an integer array nums and an integer k, 
* return true if there are two distinct indices i and j 
* in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> ultimoIndice = new HashMap<>();

        for (int indice = 0; indice < nums.length; indice++) {
            int numeroActual = nums[indice];

            if (ultimoIndice.containsKey(numeroActual)) {
                int indiceAnterior = ultimoIndice.get(numeroActual);
                if (indice - indiceAnterior <= k) {
                    return true;
                }
            }

            ultimoIndice.put(numeroActual, indice);
        }

        return false;
    }
}
