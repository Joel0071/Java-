class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length+arr2.length];
        int left=0,right=0,count=0,sum=0;

        while(left<arr1.length && right<arr2.length){
            if(arr1[left]<arr2[right]){
                ans[count++]=arr1[left++];
            }
            else{
                ans[count++]=arr2[right++];
            }
        }
        if(left==arr1.length){
            while(right<arr2.length){
                ans[count++]=arr2[right++];
            }
        }
        else if(right==arr2.length){
            while(left<arr1.length){
                ans[count++]=arr1[left++];
            }
        }
        
        double median;
        int n=ans.length;
        if(n%2==1)
        {
            median=ans[(n+1)/2-1];
        }
        else
        {
            median=(double)(ans[n/2-1]+ans[n/2])/2;
        }
        
        return median;
    }
}
