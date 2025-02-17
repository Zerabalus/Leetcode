package Medium;

import java.util.*;

/* 
You have n  tiles, where each tile has one letter tiles[i] printed on it.
Return the number of possible non-empty sequences of letters you can make using 
the letters printed on those tiles.

Constraints:

    1 <= tiles.length <= 7
    tiles consists of uppercase English letters.

 */

class LetterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        Set<String> sequences = new HashSet<>();
        int len = tiles.length();
        boolean[] used = new boolean[len];

        // genera todas las secuencias posibles
        generateSequences(tiles, "", used, sequences);

        // Resta 1 para excluir la cadena vacía del conteo
        return sequences.size() - 1;
    }

    public void generateSequences(
            String tiles,
            String current,
            boolean[] used,
            Set<String> sequences) {

        // Agregar la secuencia actual al conjunto
        sequences.add(current);

        // Intentar agregar cada caracter no utilizado a la secuencia actual
        for (int pos = 0; pos < tiles.length(); pos++) {
            if (!used[pos]) {
                used[pos] = true;
                generateSequences(
                        tiles,
                        current + tiles.charAt(pos),
                        used,
                        sequences);
                used[pos] = false;
            }
        }
    }
}