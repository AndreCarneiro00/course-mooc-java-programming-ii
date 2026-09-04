import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;
    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (map.keySet().contains(word)) {
            map.get(word).add(translation);
        } else {
            ArrayList<String> translactions = new ArrayList<>();
            translactions.add(translation);
            map.put(word, translactions);
        }
    }

    public ArrayList<String> translate(String word) {
        if (!map.keySet().contains(word)) {
            return new ArrayList<>();
        }

        return map.get(word);
    }

    public void remove(String word) {
        map.remove(word);
    }
}
