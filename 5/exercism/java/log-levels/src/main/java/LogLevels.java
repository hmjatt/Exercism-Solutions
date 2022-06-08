public class LogLevels {
    
    public static String message(String logLine) {

        String[] arrOfStrings = logLine.replaceAll("\\s+"," ").split(":");

        String message = "";

        if(logLine.contains("[ERROR]")) {
            message = arrOfStrings[1].replaceAll("\\s+"," ").trim();
        } else if(logLine.contains("[WARNING]")) {
            message = arrOfStrings[1].replaceAll("\\s+"," ").trim();
        } else if(logLine.contains("[INFO]")) {
            message = arrOfStrings[1].replaceAll("\\s+"," ").trim();
        } else {
            message = "";
        }
        return message;
    }

    public static String logLevel(String logLine) {
        String[] arrOfStrings = logLine.replaceAll("\\s+"," ").split(":");
        return arrOfStrings[0].toLowerCase().replaceAll("\\p{P}","");
    }

    public static String reformat(String logLine) {
        String[] arrOfStrings = logLine.replaceAll("\\s+"," ").split(":");
        return arrOfStrings[1].replaceAll("\\s+"," ").trim() + " " + arrOfStrings[0].toLowerCase().replaceAll("\\[", "(").replaceAll("\\]",")");
    }
}
