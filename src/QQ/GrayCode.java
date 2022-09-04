package QQ;
/*
Author: 大排面加蛋
Date  : 2022/08/19 14:43
*/

import java.util.ArrayList;
import java.util.List;

//这题得研究下 需要做到每个数相邻
public class GrayCode {
    static List<String> datelist = new ArrayList<String>();
    public static String[] getGray(int n) {
        // write code here
        getAns(n,"",1);
        String[] answer = datelist.toArray(new String[datelist.size()]);
        return answer;
    }

    //保证附近只有一位不一样
    public static void getAns(int n, String str,int flag){
        if (n==str.length()){
            datelist.add(str);
            return;
        }else{
            getAns(n,str+"0",flag);
            getAns(n,str+"1",flag);
        }
    }
}
