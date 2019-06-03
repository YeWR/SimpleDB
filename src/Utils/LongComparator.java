package Utils;

import java.util.Comparator;

public class LongComparator implements Comparator<Long> {
    @Override
    public int compare(Long o1, Long o2) {
        if(o1 == null && o2 == null){
            throw new NullPointerException();
        }

        if (o1 != null && o2 == null)
            return -1 ;

        if (o1 == null && o2 != null)
            return -1 ;

        long i1 = o1.longValue() ;
        long i2 = o2.longValue() ;

        if (i1 == i2)
            return 0 ;
        else if (i1 < i2)
            return -1 ;
        else
            return 1 ;
    }
}
