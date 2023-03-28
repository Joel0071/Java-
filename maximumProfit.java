public static int maxProfit(int[] arr){
        if(arr.length==1) return arr[0];
        int maxSum=-99,currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum) maxSum=currentSum;
            if(currentSum<0) currentSum=0;
        }
        return maxSum;
    }
