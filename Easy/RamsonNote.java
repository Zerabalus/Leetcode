package Easy;

/* 
* Given two strings ransomNote and magazine, 
* return true if ransomNote can be constructed by using 
* the letters from magazine and false otherwise.
*
* Each letter in magazine can only be used once in ransomNote. 
*/

public class RamsonNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // convertimos nota en un arreglo para iterar
        char[] letra = ransomNote.toCharArray();
        for (char caracter : letra) {
            int i = magazine.indexOf(caracter);
            if (i == -1) {
                return false;
            }
            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
        }
        return true;
    }
}
