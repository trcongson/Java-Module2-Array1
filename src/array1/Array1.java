package array1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String[] students = {"Sơn","Đức","Tùng","Tuấn","Hoàng","Tiến"};
        Scanner name = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên cần tìm: ");
        String input_name = name.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên " + input_name +" is " + (i+1));
                isExist = true;
                break;
            }
        }
        if (isExist == false){
            System.out.println("Không tìm thấy");}
    }
}
