public class Binary_Search{

    public static boolean isDivisionPossible(int arr[],int m,int maxAllowed){
        int numberOfStudent=1,chocolate=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>maxAllowed) return false;
            else{
                if(arr[i]+chocolate<=maxAllowed){
                    chocolate+=arr[i];
                }
                else{
                    numberOfStudent++;
                    chocolate=arr[i];
                }
            }
        }
        if(numberOfStudent>m) return false;
        return true;
    }

    public static int DistributChocolates(int arr[],int m){
        if(m>arr.length) return -1;
        int st=1,en=10000;
        int ans=0;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(isDivisionPossible(arr,m,mid)){
                ans=mid;
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr,int k,int mid){
        int kidPlaced=1,lastKid=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-lastKid>=mid){
                kidPlaced++;
                lastKid=arr[i];
            }
        }
        if(kidPlaced==k) return true;
        return false;
    }

    public static int OptimalRacetrack(int arr[],int k){
        if(k>arr.length) return -1;
        int st=0,en=(int)1e9;
        int ans=-1;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[]={12,34,67,90};
        System.out.println(DistributChocolates(arr1,2));
        int arr2[]={1,2,4,8,9};
        System.out.println(OptimalRacetrack(arr2,2));
    }
}
