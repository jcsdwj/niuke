package JD;
/*
Author: 大排面加蛋
Date  : 2022/09/01 22:23
*/

import static java.lang.Math.ceil;

public class JD5 {
    public static int calcDistance(int A, int B, int C, int D) {
        // write code here
        return calcSingleDisttance(A+B+C+D);
    }

    public static int calcSingleDisttance(int A){ //从A下落需要走多
        double x = A;//普通思路
        double sum = A;
        while(x > 0){
            sum += x;
            x /= 2.0;
        }
        return (int) ceil(sum);
    }
}