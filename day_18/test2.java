package day_18;

import java.util.Scanner;

public class test2 {
    /**
     * 题目:字符串统配符
     * 题目描述:在计算机中,通配符是一种特殊语法,广泛应用于文件搜索
     * 数据库,正则表达式等领域.现在要求各位实现字符串统配符的算法
     * 实现如下2个统配符:
     * *:匹配0个或者以上的字符(字符由英文字母和数字0-9组成,不区分大小写,下同)
     * ?:匹配1个字符
     * 输入:统配符表达式;
     *     一组字符串
     * 输出:返回匹配的结果,正确输出true,错误输出false
     * 输入:te?t*.*
     *     txt12.xls
     * 输出:false
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            String str1=sc.next();
            String str2=sc.next();
            int[][] dp=new int[str1.length()+1][str2.length()+1];
            for(int i=1;i<str2.length()+1;i++){
                for(int j=1;i<str2.length()-1;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            if(str1.replaceAll("[?*]","").length()==dp[str1.length()][str2.length()]){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
