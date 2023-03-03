import java.util.Scanner;

class Practise {
    public static int strStr(String haystack, String needle) {
        int index,count=0,tempIndex;
        boolean flag=false;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                tempIndex=index=i;
                for(int j=0;j<needle.length() && j<haystack.length();j++){
                    if(tempIndex<haystack.length() && needle.charAt(j)==haystack.charAt(tempIndex)){
                        tempIndex++;
                    }
                    else{
                        break;
                    }
                    if(j==needle.length()-1){
                        flag=true;
                        return index;
                    }
                }
            }
        }
        if(flag==false){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String haystack,needle;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Haystack: ");
        haystack=sc.next();
        System.out.print("Enter the Needle: ");
        needle=sc.next();
        System.out.println(strStr(haystack,needle));
    }

}
