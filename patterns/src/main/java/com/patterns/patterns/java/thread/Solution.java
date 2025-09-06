package com.patterns.patterns.java.thread;

public class Solution {
    public static int missingNumber(int[] a) {
        // code here
        int n = a.length;
        int ans =0;
        for(int i=0;i<n;i++){
            if(a[i]<=0) a[i]=0;
            ans = Math.max(ans,a[i]);
        }
        if(ans ==0) return 1;
        if(ans ==1) return 2;
        ans +=1;
        System.out.println("max="+ans);
        for(int i=0;i<n;i++){
            int val = a[i]%ans;

            if(val>=1 && val<=n){

                if(a[val-1]<ans) a[val-1] = (a[i]%ans)*ans+a[val-1]%ans;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println("rishabh");
            System.out.println("value="+a[i]);
            if((i+1)!=a[i]/ans) return i+1;
        }
        System.out.println("bansal");
        return n+1;
    }

    public static void main(String args[]){
        int[] arr = {2,2,-5,2,-2,7,1,-8};
        int ans = missingNumber(arr);
        System.out.println("ans="+ans);
    }
}

