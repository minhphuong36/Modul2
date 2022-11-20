package sudung_arrlist_linkedlist;

import java.util.Comparator;

public class SortDownByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
