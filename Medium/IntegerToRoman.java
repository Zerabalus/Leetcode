package Medium;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] valoresDecimales = {
                1000,
                900,
                500,
                400,
                100,
                90,
                50,
                40,
                10,
                9,
                5,
                4,
                1, };
        String[] valoresRomanos = {
                "M",
                "CM",
                "D",
                "CD",
                "C",
                "XC",
                "L",
                "XL",
                "X",
                "IX",
                "V",
                "IV",
                "I", };

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valoresDecimales.length; i++) {
            while (num >= valoresDecimales[i]) {
                resultado.append(valoresRomanos[i]);
                num -= valoresDecimales[i];
            }
        }

        return resultado.toString();
    }
}
