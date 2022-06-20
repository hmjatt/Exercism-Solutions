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
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
