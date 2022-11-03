import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] name = {"Phuong","Ngat","Linh","Tien","Cuong","Manh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        String inputName = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < name.length; i++) {
            if(name[i].equals(inputName)){
                System.out.println("Vị trí tên cần tìm trong danh sách:  " + inputName + " là " + i);
                check = true;
                break;
            }

            }
        if(false){
        System.out.println("Khong tim thấy!");
        }
    }
}

