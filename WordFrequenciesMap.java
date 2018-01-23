import edu.duke.*;
import java.util.*;
/**
 * Write a description of WordFrequenciesMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordFrequenciesMap {
    public void countWords(){
     FileResource fr = new FileResource();
     int total = 0;
     HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
     for(String w : fr.words()){
         w = w.toLowerCase();
         if(hashMap.keySet().contains(w)){
             hashMap.put(w,hashMap.get(w) +1);
            }
            else{
                hashMap.put(w,1);
            }
        }
     for(String w : hashMap.keySet()){
         int occurences = hashMap.get(w);
         if(occurences > 300){
             System.out.println(occurences+ "\t" + w + "\n" + "Unique words " + hashMap.size());
            }
        }
    }

}
