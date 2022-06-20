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

    
        String removedSpaces = identifier.replaceAll("\\s","_");

        return removedSpaces;
    }
}
