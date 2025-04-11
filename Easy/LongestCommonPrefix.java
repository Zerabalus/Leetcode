package Easy;

/* 
]Write a function to find the longest common prefix string amongst an array of strings.
*
* If there is no common prefix, return an empty string "".
*/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int indice = 0; indice < strs[0].length(); indice++) {
            for (int indiceCadena = 1; indiceCadena < strs.length; indiceCadena++) {
                if (indice >= strs[indiceCadena].length()
                        || strs[indiceCadena].charAt(indice) != strs[0].charAt(indice)) {
                    return strs[0].substring(0, indice);
                }
            }
        }

        return strs[0];
    }
}
