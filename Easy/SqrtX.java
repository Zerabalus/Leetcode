package Easy;
public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int izq = 0;
        int der = x;

        while (izq <= der) {
            int m = izq + (der - izq) / 2;
            long square = (long) m * m;
            if (square == x) {
                return m;
            } else if (square < x) {
                izq = m + 1;
            } else {
                der = m - 1;
            }
        }
        return der;
    }
}