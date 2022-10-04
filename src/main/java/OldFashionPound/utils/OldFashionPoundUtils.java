package OldFashionPound.utils;

import OldFashionPound.exception.WrongValuesException;

import java.util.regex.Pattern;

public class OldFashionPoundUtils {
    public static final String REGEX = "[0-9]*p[\\t\\p{Zs}][0-9]*s[\\t\\p{Zs}][0-9]*d";
    public static final String DIVISION_REGEX = "[0-9]*";
    public static final int STERLINE_PENNIES = 240;
    public static final int SCELLINI_PENNIES = 12;

    public static boolean validateValue(String value){
        return Pattern.matches(REGEX, value);
    }
    public static boolean validateMoltiplicationDivisionValue(String value) {
        return Pattern.matches(DIVISION_REGEX,value);
    }

    public static int convertToPennies(String firstValue) {
        String[] values = firstValue.split(" ");
        int valoreInPennies = 0;

        for (String value: values){
            String lastChar = value.substring(value.length()-1);
            int numericValue = Integer.parseInt(value.substring(0, value.length() - 1));
            switch (lastChar){
                case "p":
                    valoreInPennies += numericValue * STERLINE_PENNIES;
                    break;
                case "s":
                    valoreInPennies += numericValue * SCELLINI_PENNIES;
                    break;
                case "d":
                    valoreInPennies += numericValue;
                    break;
            }

        }
        return valoreInPennies;
    }

    public static String convertToCompleteValue(int value) {

        int pValue = value/STERLINE_PENNIES;
        int change = value%STERLINE_PENNIES;
        int sValue = change/SCELLINI_PENNIES;
        change = change%SCELLINI_PENNIES;

        return "" + pValue + "p " + sValue + "s " + change + "d";
    }

    public static void validateDivisionZero(String valoreDue) throws WrongValuesException {
        if (valoreDue.equals("0")){
            throw new WrongValuesException("Non si può dividere per '0'.");
        }
    }

    public static String convertPenniesToCompleteValue(int value) {

        int pValue = value/STERLINE_PENNIES;
        int change = value%STERLINE_PENNIES;
        int sValue = change/SCELLINI_PENNIES;
        change = change%SCELLINI_PENNIES;

        String returnValue = "";
        if (pValue > 0)
            returnValue += pValue + "p ";
        if (sValue > 0)
            returnValue += sValue + "s ";
        if (change > 0)
            returnValue += change + "d";
        return returnValue.isBlank() ? "" : returnValue;
    }
}
