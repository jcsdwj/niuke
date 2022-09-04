package QR;
/*
Author: 大排面加蛋
Date  : 2022/08/24 13:49
*/

import sun.text.normalizer.UCharacter;

import java.util.HashSet;

public class QR2 {
    public void qr2(){

    }
    public char findFirstRepeat(String A, int n) {
        // write code here
        HashSet<String> dict = new HashSet<String>();
        for (int i=0;i<A.length();i++){
            if (!dict.contains(A.substring(i,i+1))){
                dict.add(A.substring(i,i+1));
            }else{
                return A.charAt(i);
            }
        }
        return A.charAt(-1);
    }
}
