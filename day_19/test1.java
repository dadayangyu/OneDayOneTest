package day_19;

import java.util.Scanner;

public class test1 {
    /**
     * 题目:字符串反转
     * 题目描述:写出一个程序,接受一个字符串,然后输出该字符串反转后的字符串
     * 思路:使用自带的反转函数StringBuffer.reverse()
     * 这道题失误在字符串的输入和输出
    * */
    public static String CharAtreverse(String s){
        int length=s.length();
        String reserve="";
        for(int i=0;i<length;i++){
            reserve=s.charAt(i)+reserve;
        }
        return reserve;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(CharAtreverse(s));
        }
    }

}
