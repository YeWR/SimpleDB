package Utils;
import java.util.Comparator;

public class FloatComparator implements Comparator<Float> {

    @Override
    public int compare(Float o1, Float o2) {
        if(o1 == null && o2 == null){
            throw new NullPointerException();
        }

        if (o1 != null && o2 == null)
            return -1 ;

        if (o1 == null && o2 != null)
            return -1 ;

        float i1 = o1.floatValue() ;
        float i2 = o2.floatValue() ;

        if (i1 == i2)
            return 0 ;
        else if (i1 < i2)
            return -1 ;
        else
            return 1 ;
    }
}
