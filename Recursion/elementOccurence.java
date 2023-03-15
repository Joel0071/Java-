public static ArrayList<Integer> Occur(int arr[],int target,int idx){
        if(idx==arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> small=Occur(arr,target,idx+1);
        ans.addAll(small);
        return ans;
    }
