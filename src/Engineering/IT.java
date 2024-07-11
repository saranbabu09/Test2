package Engineering;

import java.util.HashMap;
import java.util.Map;

public class IT extends Engineering {
	public void it() {
		System.out.println("IT");
	}
	public static void main(String[] args) {
		//2.Find each word occurrence from given string in string java
//		Input = "Alice is girl and Bob is boy";
//		Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}
		
		String s = "Alice is girl and Bob is boy";
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		String[] words = s.split(" ");
		
		for (String word : words) {
			
			Integer integer = hashMap.get(word);
			
			if(integer==null) {
				hashMap.put(word, 1);
			}else {
				hashMap.put(word, integer+1);
			}
			
			
		}
		
		System.out.println(hashMap);
		
		
		
		
		
		
		
		IT obj = new IT();
		obj.univ();
		obj.eng();
		obj.it();
	
	}


}
