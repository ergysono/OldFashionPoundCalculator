package OldFashionPound.services;

import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.utils.OldFashionPoundUtils;

public class OldFashionPoundDivisione implements OldFashionPoundCalculation {
    @Override
    public String calculate(String firstValue, String secondValue) throws WrongValuesException {
        if(OldFashionPoundUtils.validateValue(firstValue) && OldFashionPoundUtils.validateMoltiplicationDivisionValue(secondValue)){
            int firstPenniesValue = OldFashionPoundUtils.convertToPennies(firstValue);
            int dividedValue = firstPenniesValue / Integer.parseInt(secondValue);
            int restValue = firstPenniesValue % Integer.parseInt(secondValue);
            if (restValue > 0)
                return OldFashionPoundUtils.convertToCompleteValue(dividedValue) + " (" + OldFashionPoundUtils.convertPenniesToCompleteValue(restValue) +")";
            else
                return OldFashionPoundUtils.convertToCompleteValue(dividedValue);
        } else {
            throw new WrongValuesException("I valori inseriti non sono corretti. Inserisci valori validi.");
        }
    }
}
