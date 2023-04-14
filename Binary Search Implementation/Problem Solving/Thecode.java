public class Binary_Search{
    //Following are the Functions which are processed on Rotated array
    //arr={3,4,5,1,2}
    //arr={6,8,2,3,5}
    public static int SearchMin(int arr[]){
        int min=-1;
        int st=0,en=arr.length-1;

        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]>arr[arr.length-1]){
                st=mid+1;
            }
            else{
                min=mid;
                en=mid-1;
            }
        }
        return min;
    }

    public static int SearchTarget(int arr[],int target){
        int st=0,en=arr.length-1;

        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<arr[en]){
                if(arr[mid]<=target && arr[en]>=target){
                    st=mid+1;
                }
                else {
                    en=mid-1;
                }
            }
            else{
                en=mid-1;
            }
        }
        return -1;
    }

    public static void SearchTargetinDuplicateElements(int arr[]){
        
    }

    //New Lecture
    public static boolean Searchin2d(int arr[][],int target){
        int m=arr.length,n=arr[0].length;
        int st=0,en=m*n-1;

        while(st<=en){
            int mid=st+(en-st)/2;
            int midval=arr[mid/n][mid%m];
            if(midval==target) return true;
            if(midval>target){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }

    public static boolean Search2D(int arr[][],int target){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;

        while(i<n && j>=0){
            if(arr[i][j]==target) return true;
            if(arr[i][j]>target) j--;
            else i++;
        }
        return false;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int ans=-1;
        int st=0,en=arr.length-1;

        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return ans;
    }

    public static int findPeakElement(int[] nums) {
        int st=0,en=nums.length-1;
        while (st<=en){
            int mid=st+(en-st)/2;
            if((nums[mid]==0 || nums[mid+1]<nums[mid]) && (nums[mid]>nums[mid-1])) return nums[mid];
            if(nums[mid]<nums[mid+1]){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,4,5},{6,7,8,9},{10,11,12,13}};
        System.out.println(Searchin2d(arr,12));
        int num[]={0,2,4,3,2};
        System.out.println(peakIndexInMountainArray(num));
        System.out.println(findPeakElement(num));
        int arr2[]={5,6,1,2,3};
        System.out.println(SearchMin(arr2));
        int arr1[]={10,11,12,1,2,3,4,5,6,7,8,9};
        System.out.print(SearchTarget(arr1,10));
    }
}
