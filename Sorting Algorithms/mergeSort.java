public class mergeSort {

    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1,n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,j,k;
        for(int m=0;m<n1;m++) left[m]=arr[l+m];
        for(int n=0;n<n2;n++) right[n]=arr[mid+1+n];
        i=0;j=0;
        k=l;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1) arr[k++]=left[i++];
        while (j<n2) arr[k++]=right[j++];
    }

    public static void mergeSort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        int arr[]={4,1,3,5,2};
        mergeSort(arr,0,arr.length-1);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
