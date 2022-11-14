package phanloaitamgiac;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestTamGiac {
    @Test
     public void isTonTaiTamGiac() {
        boolean check = TamGiac.isTonTaiTamGiac(2,3,6);
        assertEquals(check,false);
    }

    @Test
    public void isTamGiacDeu() {
        boolean check = TamGiac.isTamGiacDeu(2,2,2);
        assertEquals(check,true);
    }

    @Test
    public void isTamGiacCan() {
        boolean check = TamGiac.isTamGiacCan(4,4,6);
        assertEquals(check,true);
    }
}
