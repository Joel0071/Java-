import java.util.*;
public class kn{

    static void strStr(String haystack,String needle){
        int index,count=0,tempIndex;
        boolean flag=false;
        lol:for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                tempIndex=index=i;
                for(int j=1;j<needle.length();j++){
                    if(needle.charAt(j)==haystack.charAt(++tempIndex)){

                    }
                    else{
                        break;
                    }
                    if(j==needle.length()-1){
                        flag=true;
                        count++;
                        int in=index+(needle.length()-1);
                        System.out.println("Occurence Number "+count+" From index "+index+" to index "+in);
                        break lol;
                    }
                }
            }
        }
        if(flag==false){
            System.out.println("No Match Found");
        }
    }

    public static void main(String[] args) {
        String haystack,needle;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Haystack: ");
        haystack=sc.next();
        System.out.print("Enter the Needle: ");
        needle=sc.next();
        strStr(haystack,needle);
    }
}
