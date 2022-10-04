package OldFashionPound.controller;

import OldFashionPound.exception.UnknownOperationException;
import OldFashionPound.exception.WrongValuesException;
import OldFashionPound.utils.OldFashionPoundOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldFashionPoundCalculatorTest {

    @Test
    void calculateSomma() throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        assertEquals("9p 2s 6d",calculator.calculate(OldFashionPoundOperation.SOMMA,"5p 17s 8d","3p 4s 10d"));
    }

    @Test
    void calculateSottrazione() throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        assertEquals("2p 12s 10d",calculator.calculate(OldFashionPoundOperation.SOTTRAZIONE,"5p 17s 8d","3p 4s 10d"));
    }

    @Test
    void calculateMoltiplicazione() throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        assertEquals("11p 15s 4d",calculator.calculate(OldFashionPoundOperation.MOLTIPLICAZIONE,"5p 17s 8d","2"));
    }

    @Test
    void calculateDivisione() throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        assertEquals("1p 19s 2d (2d)",calculator.calculate(OldFashionPoundOperation.DIVISIONE,"5p 17s 8d","3"));
    }
    @Test
    void calculateSecondDivisione() throws UnknownOperationException, WrongValuesException {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        assertEquals("1p 5s 0d (1s 1d)",calculator.calculate(OldFashionPoundOperation.DIVISIONE,"18p 16s 1d","15"));
    }
}