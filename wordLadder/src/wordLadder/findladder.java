package wordLadder;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;


public class findladder {

	private ArrayList<String> dictionary  = new ArrayList<String>();;

   public findladder() throws IOException{
        
          Scanner inputfile = new Scanner(new File("short.txt"));
            
           
            while (inputfile.hasNext()) {
                this.dictionary.add(inputfile.next());
            }
           
           inputfile.close();
           
    }

  

    public wordladder findBreadth(String startWord, String endWord) throws FileNotFoundException {
    	
   	
        Queue<wordladder> ladders = new LinkedList<wordladder>();

        wordladder startLadder = new wordladder();
        startLadder.addWord(startWord);
        ladders.add(startLadder);

        while (!ladders.isEmpty() && !ladders.peek().endWord().equals(endWord)) {
			wordladder shortestLadder = ladders.remove();
            for (String word : dictionary) {
				if (this.differByOne(word, shortestLadder.endWord())) {
					wordladder copy = new wordladder(shortestLadder);
					copy.addWord(word);
					ladders.add(copy);
				}
			}
		}
        if (ladders.isEmpty()) {
			return null;
		}
		else {
			return ladders.remove();
		}
    }


    private boolean differByOne(String word1, String word2)
    {
	    if (word1.length() != word2.length()) {
            return false;
        }

        int diffCount = 0;
	    for (int i = 0; i < word1.length(); i++) {
		    if (word1.charAt(i) != word2.charAt(i)) {
			    diffCount++;
		    }
	    }
	    return (diffCount == 1);
    }

 
}

