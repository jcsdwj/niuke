package QR;
/*
Author: 大排面加蛋
Date  : 2022/08/23 09:15
*/

public class QR1 {

    public static int getPos(int[] A, int n, int val) {
        // write code here
        int a= find(A,0,n,val);
        for (int i=0;i<a;i++){
            if (A[i]==A[a]){
                a=i;
                break;
            }
        }
        return a;
    }//这里没考虑到重复情况只保存第一位

    private static int find(int []A,int left,int right,int val){
        int mid = (left+right)/2;
        if (left==right&&A[mid]!=val){
            return -1;
        }
        //要获取第一个出现的位置
        if (A[mid]==val){
            return mid;
        }else if (A[mid]<val){
            return find(A,mid,right,val);
        }else {
            return find(A,left,mid,val);
        }
    }
    private int getMid(int[] A,int l,int r,int val){
        int mid = (l+r)/2; //中间值

        if(A[mid] < val){
            l = mid;
        }
        //值相等且为首位（没有更早出现的可能）或者上一位与当前位值不等（因为是有序，只要不等，那么此处就是首次出现的位置了）
        if(A[mid] == val && (mid == 0 || A[mid]!=A[mid-1])){
            return mid;
        }//判断是否和前面重复
        //右边的或条件不能放到当前值小于val的条件判断中（因为有序的先决条件是从小到大，首次出现又是要求往前判断，所以或语句放在这个位置）
        if(A[mid]>val || (A[mid] == val && A[mid]==A[mid-1])){
            r = mid;
        }
        //如果二分到左右点相邻仍未找到这个val，则说明不存在。
        if(r-l==1 && A[r]!=val && A[l]!=val){
            return -1;
        }
        return getMid(A,l,r,val);
    }
}
