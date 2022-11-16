import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<>();

        danhSach.offer("Ngát");
        danhSach.offer("Linh");
        danhSach.offer("Tiến");
        danhSach.offer("Phương");
        danhSach.offer("Cường");
        danhSach.offerLast("Minh");
        danhSach.offerFirst("Toàn");

        while (true){
            String ten = danhSach.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }

    }
}
