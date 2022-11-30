package ss12.exercise;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() < o2.getId()){
            return -1;
        } else if (o1.getId() >o2.getId()) {
            return 1;
        }
        return 0;
    }
}
