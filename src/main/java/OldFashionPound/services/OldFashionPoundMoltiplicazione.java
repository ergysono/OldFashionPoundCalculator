package OldFashionPound.services;

import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.utils.OldFashionPoundUtils;

public class OldFashionPoundMoltiplicazione implements OldFashionPoundCalculation {
    @Override
    public String calculate(String firstValue, String secondValue) throws WrongValuesException {
        if(OldFashionPoundUtils.validateValue(firstValue) && OldFashionPoundUtils.validateMoltiplicationDivisionValue(secondValue)){
            int firstPenniesValue = OldFashionPoundUtils.convertToPennies(firstValue);
            int moltipliedValue = firstPenniesValue * Integer.parseInt(secondValue);
            return OldFashionPoundUtils.convertToCompleteValue(moltipliedValue);
        } else {
            throw new WrongValuesException("I valori inseriti non sono corretti. Inserisci valori validi. (es. 12p 2s 3d)");
        }
    }
}
