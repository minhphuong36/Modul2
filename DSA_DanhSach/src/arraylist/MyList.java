package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        int size = elements.length;
        Object[] newElement = new Object[size+ 1];
        for (int i = 0; i < newElement.length; i++) {
            if(i < index){
                newElement[i] = elements[i];
            }else if(i == index){
                newElement[i] = e;
            }else {
                newElement[i] = elements[i-1];
            }
        }
        elements = newElement;

    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


}
