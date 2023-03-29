import java.util.Arrays;

public class kn{

    public static int findminLength(int nums[],int maxdegreeElement){
        int left=0,right= nums.length-1;
        boolean flag=false;
        while(left<right){
            if(nums[left]!=maxdegreeElement){
                left++;
                flag=true;
            }
            if (nums[right]!=maxdegreeElement){
                right--;
                flag=true;
            }
            if (!flag) return right-left+1;
            flag=false;
        }
        return right-left+1;
    }

    public static int findShortestSubArray(int[] nums) {
        //Find the max value
        int max= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        //Make the Frequency array
        int freqArr[]=new int[max+1];

        //Assign values to it
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) freqArr[nums[i]]++;
        }
        //Find the Degree of the Array
        int maxdegreeElement=0,maxi=0;
        for(int i=0;i<freqArr.length;i++){
            if(freqArr[i]>=maxi){
                maxdegreeElement=i;
                maxi=freqArr[i];
            }
        }

        int minLength=Integer.MAX_VALUE;
        //lol
        for(int i=0;i<freqArr.length;i++){
            if(freqArr[i]==maxi){
                int curr=findminLength(nums,i);
                if(curr<minLength) minLength=curr;
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(arr));
    }
}
