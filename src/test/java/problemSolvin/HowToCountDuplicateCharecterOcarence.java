package problemSolvin;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HowToCountDuplicateCharecterOcarence {
	
	@Test
	public void getCharCount() {
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		String name= "masrura";
		
		char charArray[]=name.toCharArray();
		
		for (char c : charArray) {
			
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				
				charMap.put(c, 1);
			}
		}
		
		System.out.println(name+" : "+charMap);
	}
	
	
}
