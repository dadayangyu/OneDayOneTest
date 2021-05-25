package day_25;

import java.util.Scanner;

public class test2 {
    /**
     * 题目:数根
     * 题目描述:数根可以通过把一个数的各个位上的数字加起来得到
     * 如果得到的数是个一位数,那么这个数就是数根;如果结果是两位数
     * 或者包括更多的数字,那么再把这些数字加起来.如此进行下来,直到
     * 得到时候一位数为止.比如,对于24来说,把2和4相加得到6,由于6是
     * 一位数,因此6是24的数根.
     * 再比如39,把3和9加起来得到12,由于12不是一位数,还得把1和2加起来
     * 最后得到3,这是一个一位数,因此3是39的数根
     * 现在给你一个正整数,输出它的数根
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String st=sc.next();
            while(st.length()>1){
                int result=0;
                for(int i=0;i<st.length();i++) {
                    result += st.charAt(i) - '0';
                }
                st = String.valueOf(result);
            }
            System.out.println(st);
        }
    }
}
