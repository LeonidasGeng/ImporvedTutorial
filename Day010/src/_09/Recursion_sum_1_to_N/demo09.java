package _09.Recursion_sum_1_to_N;

public class demo09 {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println("sum = " + sum);
    }

    //1到n的和 = n+1 到 n-1 的和
    //出口，当 n==1 时，返回1
    //getSum方法的作用，参数n，就是求1到n的和

    public static int getSum(int n) {
        if (n==1) {
            return 1;
        }
        return n + getSum(n - 1); //1到n-1的和
    }
}
