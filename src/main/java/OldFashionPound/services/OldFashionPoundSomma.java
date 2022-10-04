package OldFashionPound.services;

import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.utils.OldFashionPoundUtils;

public class OldFashionPoundSomma implements OldFashionPoundCalculation {
    @Override
    public String calculate(String firstValue, String secondValue) throws WrongValuesException {
        if(OldFashionPoundUtils.validateValue(firstValue) && OldFashionPoundUtils.validateValue(secondValue)){
            int firstPenniesValue = OldFashionPoundUtils.convertToPennies(firstValue);
            int secondPenniesValue = OldFashionPoundUtils.convertToPennies(secondValue);
            int sum = firstPenniesValue + secondPenniesValue;
            return OldFashionPoundUtils.convertToCompleteValue(sum);
        } else {
            throw new WrongValuesException("I valori inseriti non sono corretti. Inserisci valori validi. (es. 12p 2s 3d)");
        }
    }
}
