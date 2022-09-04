package XM;
/*
Author: 大排面加蛋
Date  : 2022/08/29 22:07
*/

import java.util.ArrayList;

public class XM3 {
    public int calculateMax(int[] prices) {
        //计算两次最大差值
        ArrayList ans = new ArrayList();
        //找到所有的递增
        for(int i=0;i<prices.length;i++){
            int min = prices[i];
            for (int j=i+1;j< prices.length;j++){
                if (prices[j]>=min){
                    continue;
                }else{ //找到一个
                    ans.add(prices[j-1]-min);
                }
            }
        }
        return 0;
    }
}
