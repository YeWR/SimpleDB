package Utils;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        if(o1 == null && o2 == null){
            throw new NullPointerException();
        }

        if (o1 != null && o2 == null)
            return -1 ;

        if (o1 == null && o2 != null)
            return -1 ;

        double i1 = o1.doubleValue() ;
        double i2 = o2.doubleValue() ;

        if (i1 == i2)
            return 0 ;
        else if (i1 < i2)
            return -1 ;
        else
            return 1 ;
    }
}
