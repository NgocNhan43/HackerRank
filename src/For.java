import java.util.Scanner;

public class For {
    public static void main(String[] args) {
//        for (int i = 2; i <=9; i++){
//           for (int j = 1; j <=10; j++){
//               System.out.println(i+ "X" +j+ "=" +(i*j));
//           }
//            System.out.println("......");
//        }


        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(n +"X" +i +"=" + n*i);
//        }


        // Nhập số lượng bộ test cases (t)
        int t = sc.nextInt();

        // Lặp qua từng test case
        for (int i = 0; i < t; i++) {
            // Nhập giá trị a, b, và n cho mỗi test case
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // Tính và in ra kết quả cho mỗi test case
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp += (Math.pow(2, j) * b);
                System.out.print(temp + " ");
            }
            System.out.println();  // In một dòng trống sau mỗi test case
        }

        sc.close();  // Đóng Scanner sau khi sử dụng xong
    }
}
