
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCountEx {
public static void main(String[] args) {
	String s= "He is Ram. Ram is 12 years old. Ram loves reading books.";
	System.out.println(s);
	s = s.toLowerCase();
	String words[] = s.split(" ");
	
	Map<String, Integer> word_map= new HashMap<>();
	for(String word : words) {
		if(word_map.get(word)!=null) {
			word_map.put(word,word_map.get(word)+1);
		}else {
			word_map.put(word, 1);
		}
	}
	System.out.println("Duplicate word");
	Set<String> set = word_map.keySet();
	for(String word : set){
	if(word_map.get(word)>1)
		System.out.println(word);
	}
}
}
