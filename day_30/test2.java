package day_30;

import java.util.Scanner;

public class test2 {
    /**
     * 题目:因子个数
     * 题目描述:一个正整数可以分解成一个或者多个数组的积
     * 例如:36=2*2*3*3,即包含2和3两个因子
     * NowCoder最近在研究因子个数的分布规律,现在给出一系列正整数
     * 他希望你开发一个程序输出每个正整数的因子个数
     * 输入:30 26 20
     * 输出:3 2 2
     * 题目思路:这里的因子要求是质因子
    * */
    public static void main(String[] args) {
        //进行输入操作
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (isPrimer(n)) {
                System.out.println(1);
                continue;
            }
            int count = 0;
            //从i=2开始到sqrt(num)做循环,先要保证这个数字是质数
            for (int i = 2; i <= Math.sqrt(n); i++) {
                //在i是质数的基础上,要保证i是另一个数的因数
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    count++;  //count++这步必须保证是在是双重条件的基础上
                }
            }
            //质数是不包含1的
            if (n != 1) {
                count++;
            }
            System.out.println(count);
        }
    }
    public static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
