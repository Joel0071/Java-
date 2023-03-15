public static boolean isSorted(int arr[],int idx){
        if(arr.length==idx){
            return true;
        }
        if(arr[idx]<arr[idx-1]) return false;
        return isSorted(arr,idx+1);
    }
