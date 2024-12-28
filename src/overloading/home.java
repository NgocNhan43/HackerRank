package overloading;

public class home {
    public static void main(String[] args) {

        math mt = new math();
        int result = mt.findMin(5, 6);
        System.out.println("Min:" +result);

        double results = mt.findMin(5.8, 6.2);
        System.out.println("Min:"+results);

        double sum = mt.sum(5,2);
        System.out.println("sum:" +sum);

        int[] arrys = new int[]{1,2,3,4};
        var resultss = mt.sum(arrys);
        System.out.println("sum "+resultss);
    }
}
