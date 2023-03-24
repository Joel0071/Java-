public class quickSort {

    public static void swap(int arr[],int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }

    public static int partition(int arr[],int start,int end){
        int pivot=arr[start];
        int cnt=0;
        for (int i=start+1;i<=end;i++){
            if(arr[i]<=pivot) cnt++;
        }
        int pivotInd=start+cnt;
        swap(arr,start,pivotInd);
        int i=start,j=end;
        while (i<pivotInd && j>pivotInd){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if(i<pivotInd && j>pivotInd){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotInd;
    }

    public static void quickSorting(int arr[],int start,int end){
        if(start>=end) return;
        int pi=partition(arr,start,end);
        quickSorting(arr,start,pi-1);
        quickSorting(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int arr[]={6,6,3,1,5,5,4};
        quickSorting(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
