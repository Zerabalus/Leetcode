package Easy;

/* 
* Given two strings needle and haystack, 
* return the index of the first occurrence of needle in haystack, 
* or -1 if needle is not part of haystack.
*/

public class IndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        int longitudhaystack = haystack.length();
        int longitudneedle = needle.length();
        int indiceN = 0;
        for (int i = 0; i < longitudhaystack; i++) {
            // mientras los caracteres sean iguales, incrementa el indice de s
            if (haystack.charAt(i) == needle.charAt(indiceN)) {
                indiceN++;
            } else {
                // comienza desde el siguiente índice del índice de inicio anterior
                i = i - indiceN;
                // s debe comenzar desde el índice 0
                indiceN = 0;
            }
            // comprobar si el indice de s alcanzó la longitud s
            if (indiceN == longitudneedle) {
                // devolver el primer índice
                return i - longitudneedle + 1;
            }
        }
        return -1;
    }
}
