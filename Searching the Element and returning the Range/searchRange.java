public static int[] searchRange(int nums[],int target){
        int ans[]={-1,-1};
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]==target && nums[right]!=target){
                right--;
            }
            else if(nums[right]==target && nums[left]!=target){
                left++;
            }
            else if(nums[right]!=target && nums[left]!=target){
                left++;
                right--;
            }
            if(nums[left]==target && nums[right]==target){
                ans[0]=left;
                ans[1]=right;
                return ans;
            }
        }
        if(nums.length==1 && nums[0]==target) {
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        return ans;
    }
