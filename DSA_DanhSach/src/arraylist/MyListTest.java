package arraylist;

import org.testng.annotations.Test;

public class MyListTest {
    @Test
    public void addTest(){
        MyList list = new MyList();
        list.add(0,1);
        list.add(1,3);
        list.add(2,5);
        System.out.println("list :"+list);
    }


}
