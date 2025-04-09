package Easy;

/* 
* You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n^2]. 
* Each integer appears exactly once except a which appears twice and b which is missing. 
* The task is to find the repeating and missing numbers a and b.
* Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
*
* Constraints:
*   2 <= n == grid.length == grid[i].length <= 50
*   1 <= grid[i][j] <= n * n
*   For all x that 1 <= x <= n * n there is exactly one x that is not equal to any of the grid members.
*   For all x that 1 <= x <= n * n there is exactly one x that is equal to exactly two of the grid members.
*   For all x that 1 <= x <= n * n except two of them there is exactly one pair of i, j that 0 <= i, j <= n - 1 and grid[i][j] == x.
*/

public class MissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int tamaño = grid.length;
        boolean numerosEncontrados[] = new boolean[tamaño * tamaño];
        int numeroRepetido = 0;
        for (int fila = 0; fila < grid.length; fila++) {
            for (int numero : grid[fila]) {
                if (numerosEncontrados[numero - 1])
                    numeroRepetido = numero;
                else
                    numerosEncontrados[numero - 1] = true;
            }
        }
        int numeroFaltante = 0;
        for (int fila = 0; fila < numerosEncontrados.length; fila++) {
            if (!numerosEncontrados[fila]) {
                numeroFaltante = fila + 1;
                break;
            }
        }
        return new int[] { numeroRepetido, numeroFaltante };
    }
}
