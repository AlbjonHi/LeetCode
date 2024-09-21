package Solutions;

public class RomanToInt {
    public int romanToInt(String s) {
        char[] chars=s.toCharArray();
        int integerConversion=0;
        for(int i=0;i<chars.length;i++){
            switch (chars[i]) {
                case 'I' -> integerConversion = integerConversion + 1;
                case 'V' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 5;
                        break;
                    } else if (chars[i - 1] == 'I') {
                        integerConversion = integerConversion + 3;
                        break;
                    }
                    integerConversion = integerConversion + 5;
                }
                case 'X' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 10;
                        break;
                    } else if (chars[i - 1] == 'I') {
                        integerConversion = integerConversion + 8;
                        break;
                    }
                    integerConversion = integerConversion + 10;
                }
                case 'L' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 50;
                        break;
                    } else if (chars[i - 1] == 'X') {
                        integerConversion = integerConversion + (3 * 10);
                        break;
                    }
                    integerConversion = integerConversion + 50;
                }
                case 'C' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 100;
                        break;
                    } else if (chars[i - 1] == 'X') {
                        integerConversion = integerConversion + (8 * 10);
                        break;
                    }
                    integerConversion = integerConversion + 100;
                }
                case 'D' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 500;
                        break;
                    } else if (chars[i - 1] == 'C') {
                        integerConversion = integerConversion + (3 * 100);
                        break;
                    }
                    integerConversion = integerConversion + 500;
                }
                case 'M' -> {
                    if (i == 0) {
                        integerConversion = integerConversion + 1000;
                        break;
                    } else if (chars[i - 1] == 'C') {
                        integerConversion = integerConversion + (8 * 100);
                        break;
                    }
                    integerConversion = integerConversion + 1000;
                }
            }
        }
        return integerConversion;
    }
}
