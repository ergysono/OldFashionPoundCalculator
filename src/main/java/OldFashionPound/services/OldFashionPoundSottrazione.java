package OldFashionPound.services;

import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.utils.OldFashionPoundUtils;

public class OldFashionPoundSottrazione implements OldFashionPoundCalculation {
    @Override
    public String calculate(String firstValue, String secondValue) throws WrongValuesException {
        if(OldFashionPoundUtils.validateValue(firstValue) && OldFashionPoundUtils.validateValue(secondValue)){
            int firstPenniesValue = OldFashionPoundUtils.convertToPennies(firstValue);
            int secondPenniesValue = OldFashionPoundUtils.convertToPennies(secondValue);
            int sub = firstPenniesValue - secondPenniesValue;
            if (sub < 0)
                return "- " + OldFashionPoundUtils.convertToCompleteValue(Math.abs(sub));
            else
                return OldFashionPoundUtils.convertToCompleteValue(sub);
        } else {
            throw new WrongValuesException("I valori inseriti non sono corretti. Inserisci valori validi. (es. 12p 2s 3d)");
        }
    }
}
