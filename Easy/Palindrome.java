package Easy;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0)  {
            return false;
        }

        int palindromo = 0;
        while (x > palindromo) {
            //numero se detine cuando se haya revertido al menos la mitad del num
            palindromo = palindromo * 10 + x % 10;
            x /= 10;
            /* x % 10 obtiene el último dígito de x.
            palindromo = palindromo * 10 + x % 10 construye la parte invertida 
            x /= 10 elimina el último dígito de x. */
        }
        return x == palindromo || x == palindromo / 10; 
    }
}