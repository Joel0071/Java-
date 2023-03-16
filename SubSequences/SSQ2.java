public static void returnSSQ2(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char a=s.charAt(0);
        returnSSQ2(s.substring(1),ans+a);
        returnSSQ2(s.substring(1),ans);
    }
