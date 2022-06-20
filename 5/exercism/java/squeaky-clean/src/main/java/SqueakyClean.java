class SqueakyClean {
    static String clean(String identifier) {
        char[] chars = identifier.toCharArray();
        StringBuilder sb = new StringBuilder();
        String s = "";
        for(int i = 0; i < chars.length; i++) {
            if(Character.isWhitespace(chars[i])) {
                chars[i] = "_".charAt(0);
                sb.append(chars[i]);
            } else if(Character.isISOControl(chars[i])) {
                s = String.valueOf(chars[i]);
                s = s.replace(s, "CTRL");
                sb.append(s);
            } else if(chars[i] == "-".charAt(0)){
                // String s1 =  String.valueOf(chars[i]);
                // String s2 = String.valueOf(chars[i+1]);
                // String s4 = s2.toUpperCase();
                // String s3 = s1 + s2;
                // s = identifier;
                // s = identifier.replaceAll(s3,(s2.toUpperCase()));
                // s = s.replace(s1, "");
                // s = s.replace(s1, "");
                // s = s.replace(s3, "");

        
                sb.append(s);
             
                
            } 
            else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
