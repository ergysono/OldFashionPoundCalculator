package OldFashionPound.utils;

import OldFashionPound.services.*;
import OldFashionPound.services.OldFashionPoundCalculation;

public class OldFashionPoundFactory {

    public static OldFashionPoundCalculation getCalculationType(OldFashionPoundOperation operation){
        switch (operation){
            case SOMMA:return new OldFashionPoundSomma();
            case SOTTRAZIONE:return new OldFashionPoundSottrazione();
            case MOLTIPLICAZIONE:return new OldFashionPoundMoltiplicazione();
            case DIVISIONE:return new OldFashionPoundDivisione();
            default:return null;
        }
    }
}
