class SqueakyClean {
    static String clean(String identifier) {
        // char [] cleanIt = identifier.toCharArray();
        // // if(java.lang.Character.isWhitespace(identifier) == true) {
        // //     return
        // // }
        // char currentChar, changedChar;
        // for (int i = 0; i < cleanIt.length; i++) {
  
        //     // accessing each element of array
        //     currentChar = cleanIt[i];
        //     if(java.lang.Character.isWhitespace(currentChar) == true) {
        //         changedChar = currentChar.toString
        //     }
        // }

        // StringBuilder str = new StringBuilder(identifier);

        // for (int i = 0; i < identifier.length(); i++){
        //     char c = identifier.charAt(i);        
        //     //Process char
        //     if(Character.isWhitespace(c) == true ){
        //         c = c.toString();
        //     }

    
        // String removedSpaces = identifier.replaceAll("\\s","_");

        // return removedSpaces;

        // str.replace("_");

        // String removedSpaces = "";

        // if(identifier.contains(" ")) {
        //     removedSpaces = identifier.replaceAll("\\s","_");
           

        // } else if (identifier.contains("\\p{Cc}")) {
        //     removedSpaces = identifier.replaceAll("\\p{Cc}", "CTRL");
        // }

        // return removedSpaces;

        char[] chars = identifier.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(Character.isWhitespace(chars[i])) {
                chars[i] = "_".charAt(0);
                sb.append(chars[i]);
            } else if(!Character.isWhitespace(chars[i])) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();

        // String newSentence = identifier.codePoints()
        // .filter(c -> !Character.isWhitespace(c))
        // .collect(StringBuilder::new, 
        //       StringBuilder::appendCodePoint, 
        //       StringBuilder::append).toString();
        


    }
}
