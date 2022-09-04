package JD;
/*
Author: 大排面加蛋
Date  : 2022/08/25 11:39
*/

public class JD3 {
    public int getInitial(int n) {
        // write code here
        int init=0,k,i,next=0,result;
        while (true){
            k= init;
            for ( i =1;i<n;i++){
                next=k*n+1; //上一轮有的
                if(next%(n-1)==0){
                    k=next/(n-1);
                }else{
                    init++;
                    break;
                }
            }
            if (i==n){
                result=k*n+1; //直接得到结果
                break;
            }
        }
        return result;
    }
}
