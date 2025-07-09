import java.util.*;
public class BinarySearch {
    public static Product binary(Product[] p, String target){
        Arrays.sort(p, Comparator.comparing(pr -> pr.productName.toLowerCase()));
        int l = 0;
        int r = p.length-1;
        while (l<=r){
            int m = (l+r)/2;
            int temp = p[m].productName.compareToIgnoreCase(target);
            if (temp==0)
                return p[m];
            else if (temp<0)
                l = m+1;
            else
                r = m-1;
        }
        return null;
    }
}
