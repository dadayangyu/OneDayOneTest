package day_25;

import java.util.Scanner;

public class test1 {
    /**
     * 题目:星际密码
     * 题目描述:星际战争开展了100年之后,NowCoder终于破译了外星人
     * 的密码!他们的密码是一串整数,通过一张表里的信息映射成最终的4位密码
     * 表的规则是:n对应的值是矩阵X的n次方的左上角,如果这个数不足4位则用
     * 0填充,如果大于4位的则只输出最后的4位.
     * 输入描述:输入有多组数据.每组数据两行:第一行包含整数n(1<=n<=100)
     * 第二行包含n个正整数Xi(1<=Xi<=10000)
     * 输出描述:对应每一组输入,输出一行相应的密码
     * 思路:通过题意就可以发现这组数据是一组fib数据
    * */
    public static void main(String[] args) {
        int[] fib=new int[10001];
        fib[1]=1;
        fib[2]=2;
        for(int i=3;i<10001;i++){
            fib[i]=fib[i-1]+fib[i-2];
            fib[i]=fib[i]%10000;
        }
        int count=0;
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while(sc.hasNext()){
            count=sc.nextInt();
            int[] arrays=new int[count];
            for(int i=0;i<count;i++){
                arrays[i]=sc.nextInt();
            }
            for(int i=0;i<count;i++){
                System.out.printf("%04d",fib[arrays[i]]);
            }
            System.out.println();

        }
    }

}

