import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return (languages.isEmpty() == true) ? true : false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return (languages.contains(language) == true) ? true : false;
    }

    public boolean isExciting() {
        return (languages.contains("Java") == true || languages.contains("Kotlin") == true) ? true : false;
    }
}
