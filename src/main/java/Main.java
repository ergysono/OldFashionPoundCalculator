import OldFashionPound.utils.OldFashionPoundOperation;
import OldFashionPound.controller.OldFashionPoundCalculator;
import OldFashionPound.exception.UnknownOperationException;
import OldFashionPound.exception.WrongValuesException;

public class Main {
    public static void main(String[] args) {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculator();
        try {
            System.out.println(calculator.calculate(OldFashionPoundOperation.SOMMA,"1p 19s 7d","d"));
        } catch (UnknownOperationException e) {
            System.out.println(e.getMessage());
        } catch (WrongValuesException e) {
            System.out.println(e.getMessage());
        }
    }
}