package OldFashionPound.services;

import OldFashionPound.exception.WrongValuesException;

public interface OldFashionPoundCalculation {

    String calculate(String firstValue, String secondValue) throws WrongValuesException;
}
