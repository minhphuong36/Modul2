import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack_DaoNguoc {
    public static void main(String[] args) {
        Stack<Integer> stackSo = new Stack<>();
        stackSo.push(9);
        stackSo.push(10);
        stackSo.push(20);
        stackSo.push(-10);
        stackSo.push(0);
        System.out.println("Mang ban dau: " + stackSo);
        System.out.println("mảng sau khi đảo ngược");
        while (!stackSo.isEmpty()){
            System.out.print(stackSo.pop() + "\t");
        }



//        Đảo ngược chuỗi.

//        Stack<String> chuoiStack = new Stack<>();
//        System.out.println("Nhập chuỗi");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            chuoiStack.push(s.charAt(i)+ "");
//        }
//        System.out.println("Chuỗi đảo ngược: ");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(chuoiStack.pop());
//        }


    }

}
