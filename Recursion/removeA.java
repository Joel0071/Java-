public static String removeA(String s,int idx){
        if(s.length()==idx){
            return "";
        }
        String small=removeA(s,idx+1);
        if(s.charAt(idx)=='a'){
            return small;
        }
        else{
            return s.charAt(idx)+small;
        }
    }
