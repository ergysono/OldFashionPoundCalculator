package OldFashionPound.controller;

import OldFashionPound.exception.UnknownOperationException;
import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.services.OldFashionPoundCalculation;
import OldFashionPound.utils.OldFashionPoundOperation;
import OldFashionPound.utils.OldFashionPoundFactory;

public class OldFashionPoundCalculator {

    public String calculate(OldFashionPoundOperation operation, String firstValue, String secondValue) throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculation calculationType = OldFashionPoundFactory.getCalculationType(operation);

        if (calculationType != null){
            return calculationType.calculate(firstValue,secondValue);
        } else {
            throw new UnknownOperationException("Operazione non Valida.\n Seleziona tra SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE e DIVISIONE.");
        }
    }

}
