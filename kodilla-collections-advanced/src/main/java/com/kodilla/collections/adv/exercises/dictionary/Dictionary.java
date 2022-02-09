package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());//jeżeli żadnego słowa angielskiego
        // w mapie nie ma, to tworzona jest pusta lista (wykorzystujemy tu metodę getOrDefault
        // z interfejsu Map, która zwraca podaną jako argument
        // wartość domyślną, gdy mapa nie zawiera szukanego przez nas wpisu)
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) { //  metody przeciążone – ang. overload
        // – o tej samej nazwie, lecz różniące się listą argumentów wywołania
   //     return Collections.emptyList(); - przed testem metody
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    } //  metody przeciążone – ang. overload – o tej samej nazwie, lecz różniące się listą argumentów wywołania

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
            //return Collections.emptyList(); //  tworzy i zwraca pustą listę, jest nam potrzebna,
            // ponieważ typem zwracanym przez obie metody findEnglishWords jest lista obiektów typu EnglishWord.
        }
        return result;
    }
    public int size() {
        return dictionary.size();
    }
}
