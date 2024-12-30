package codeLearn;

import java.util.Scanner;

public class CountEven {

    public static void countEven(int[]array){
        int count = 0;
        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
// cách fill dữ liệu vào luôn.
//        int []arr = new int[]{2,3,4,5};
//        countEven(arr);

        //cách nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        int[]array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        countEven(array);

    }

}
