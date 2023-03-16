public static void returnSSQ3(int nums[],int idx,int sum){
        if(idx==nums.length){
            System.out.println(sum);
            return;
        }
        sum+=nums[idx];
        returnSSQ3(nums,idx+1,sum);
        sum-=nums[idx];
        returnSSQ3(nums,idx+1,sum);
    }
