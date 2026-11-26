import java.io.*;   // 包含 BufferedReader, StringTokenizer, PrintWriter (實作高速 I/O)
import java.util.*; // 包含 ArrayList, HashMap, Arrays.sort(), Stack, Queue 等所有常用資料結構
import java.math.*; // 包含 BigInteger 和 BigDecimal (處理高精度大數必備)
import java.lang.*;
import java.util.regex.MatchResult;

class inputwithregex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); // class name ClassName
        //method name .methodName()
        //how to scanf? 
        //use regex!
        if(scn.findInLine("(\\d+) (\\d+) (\\d+)") != null){
            MatchResult match = scn.match();
            int a[] = new int[3];
            a[0] = Integer.parseInt(match.group(1));
            a[1] = Integer.parseInt(match.group(2));
            a[2] = Integer.parseInt(match.group(3));
            System.out.printf("%d %d %d\n",a[0],a[1],a[2]);
        }
    }
}