package wordLadder;

import java.util.ArrayList;

public class wordladder {
    private ArrayList<String> words;

    public wordladder() {
        this.words = new ArrayList<String>();
    }

    //Copy words from "copy" into words
    public wordladder(wordladder copy) {
        //Call the default constructor
        this();
        for (String nextWord: copy.words) {
            this.words.add(nextWord);
        }
    }

    public void addWord(String newWord) {
        this.words.add(newWord);
    }

    public void removeWord() {
        this.words.remove(this.words.size()-1);
    }

    public String endWord() {
        return this.words.get(this.words.size()-1);
    }

    public ArrayList<String> getWord(){
        return this.words;
    }
    
    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public void append(wordladder other) {
        for (String str : other.words) {
            this.addWord(str);
        }
    }

    public String toString() {
        return this.words.toString();
    }
}
