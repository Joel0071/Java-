public static ArrayList<String> returnSSQ1(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char current=s.charAt(0);
        ArrayList<String> small=new ArrayList<>();
        small=returnSSQ1(s.substring(1));
        for(String ss:small){
            ans.add(ss);
            ans.add(current+ss);
        }
        return ans;
    }
