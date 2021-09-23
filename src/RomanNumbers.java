public class RomanNumbers {

    public boolean isRoman (String value) {
        switch (value) {
            case "I" :
                return true;
            case "II" :
                return true;
            case "III" :
                return true;
            case "IV" :
                return true;
            case "V" :
                return true;
            case "VI" :
                return true;
            case "VII" :
                return true;
            case "VIII" :
                return true;
            case "IX" :
                return true;
            case "X" :
                return true;
        }
        return false;
    }

    public int romanToInt (String value) {
        switch (value) {
            case "I" :
                return 1;
            case "II" :
                return 2;
            case "III" :
                return 3;
            case "IV" :
                return 4;
            case "V" :
                return 5;
            case "VI" :
                return 6;
            case "VII" :
                return 7;
            case "VIII" :
                return 8;
            case "IX" :
                return 9;
            case "X" :
                return 10;
        }
        return 0;
    }

    public String intToRomanNumbers(int value) {
        String[] romanNumbers = new String[101];
        romanNumbers[1] = "I";
        romanNumbers[2] = "II";
        romanNumbers[3] = "III";
        romanNumbers[4] = "IV";
        romanNumbers[5] = "V";
        romanNumbers[6] = "VI";
        romanNumbers[7] = "VII";
        romanNumbers[8] = "VIII";
        romanNumbers[9] = "IX";
        romanNumbers[10] = "X";
        romanNumbers[11] = "XI";
        romanNumbers[12] = "XII";
        romanNumbers[13] = "XIII";
        romanNumbers[14] = "XIV";
        romanNumbers[15] = "XV";
        romanNumbers[16] = "XVI";
        romanNumbers[17] = "XVII";
        romanNumbers[18] = "XVIII";
        romanNumbers[19] = "XIX";
        romanNumbers[20] = "XX";
        romanNumbers[21] = "XXI";
        romanNumbers[22] = "XXII";
        romanNumbers[23] = "XXIII";
        romanNumbers[24] = "XXIV";
        romanNumbers[25] = "XXV";
        romanNumbers[26] = "XXVI";
        romanNumbers[27] = "XXVII";
        romanNumbers[28] = "XXVIII";
        romanNumbers[29] = "XXIX";
        romanNumbers[30] = "XXX";
        romanNumbers[31] = "XXXI";
        romanNumbers[32] = "XXXII";
        romanNumbers[33] = "XXXIII";
        romanNumbers[34] = "XXXIV";
        romanNumbers[35] = "XXXV";
        romanNumbers[36] = "XXXVI";
        romanNumbers[37] = "XXXVII";
        romanNumbers[38] = "XXXVIII";
        romanNumbers[39] = "XXXIX";
        romanNumbers[40] = "XL";
        romanNumbers[41] = "XLI";
        romanNumbers[42] = "XLII";
        romanNumbers[43] = "XLIII";
        romanNumbers[44] = "XLIV";
        romanNumbers[45] = "XLV";
        romanNumbers[46] = "XLVI";
        romanNumbers[47] = "XLVII";
        romanNumbers[48] = "XLVIII";
        romanNumbers[49] = "XLIX";
        romanNumbers[50] = "L";
        romanNumbers[51] = "LI";
        romanNumbers[52] = "LII";
        romanNumbers[53] = "LIII";
        romanNumbers[54] = "LIV";
        romanNumbers[55] = "LV";
        romanNumbers[56] = "LVI";
        romanNumbers[57] = "LVII";
        romanNumbers[58] = "LVIII";
        romanNumbers[59] = "LIX";
        romanNumbers[60] = "LX";
        romanNumbers[61] = "LXI";
        romanNumbers[62] = "LXII";
        romanNumbers[63] = "LXIII";
        romanNumbers[64] = "LXIV";
        romanNumbers[65] = "LXV";
        romanNumbers[66] = "LXVI";
        romanNumbers[67] = "LXVII";
        romanNumbers[68] = "LXVIII";
        romanNumbers[69] = "LXIX";
        romanNumbers[70] = "LXX";
        romanNumbers[71] = "LXXI";
        romanNumbers[72] = "LXXII";
        romanNumbers[73] = "LXXIII";
        romanNumbers[74] = "LXXIV";
        romanNumbers[75] = "LXXV";
        romanNumbers[76] = "LXXVI";
        romanNumbers[77] = "LXXVII";
        romanNumbers[78] = "LXXVIII";
        romanNumbers[79] = "LXXIX";
        romanNumbers[80] = "LXXX";
        romanNumbers[81] = "LXXXI";
        romanNumbers[82] = "LXXXII";
        romanNumbers[83] = "LXXXIII";
        romanNumbers[84] = "LXXXIV";
        romanNumbers[85] = "LXXXV";
        romanNumbers[86] = "LXXXVI";
        romanNumbers[87] = "LXXXVII";
        romanNumbers[88] = "LXXXVIII";
        romanNumbers[89] = "LXXXIX";
        romanNumbers[90] = "XC";
        romanNumbers[91] = "XCI";
        romanNumbers[92] = "XCII";
        romanNumbers[93] = "XCIII";
        romanNumbers[94] = "XCIV";
        romanNumbers[95] = "XCV";
        romanNumbers[96] = "XCVI";
        romanNumbers[97] = "XCVII";
        romanNumbers[98] = "XCVIII";
        romanNumbers[99] = "XCIX";
        romanNumbers[100] = "C";

        if (value < 0)
            return "Ошибка!";

        return romanNumbers[value];
    }
}