public static String reverseST(String s){
        if(s.length()==0) return "";
        return reverseST(s.substring(1))+s.charAt(0);
    }
