public static void keyPad(String s,String map[],String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        int currentNum=s.charAt(0)-'0';
        String mapping=map[currentNum];
        for(int i=0;i<mapping.length();i++){
            keyPad(s.substring(1),map,ans+mapping.charAt(i));
        }
    }
