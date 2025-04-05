public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5, 4,  1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();

        int[] testNumbers = {1, 4, 9, 12, 27, 44, 58, 90, 399, 444, 999, 1000};

        for (int num : testNumbers) {
            String roman = converter.intToRoman(num);
            System.out.println(num + " => " + roman);
        }
    }
}
