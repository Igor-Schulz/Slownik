package slownik;

import java.util.HashMap;
import java.util.Map;


public class Dictionary {
	
	public static void przetworzString(String s, HashMap<Character,Integer> mapa) {

		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);        
		    for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
		        char key = entry.getKey();
		        Object value = entry.getValue();
		        	if(key == c) {
		        		mapa.put(key, (int)value + 1);
		        	}
		        
		    }
		}
		for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
			char key = entry.getKey();
	        Object value = entry.getValue();
	        System.out.println("Litera: " + key +" wyst�pi�a: "+value+" razy");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> slownik = new HashMap<Character,Integer>() {};
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			  slownik.put(ch, 0); 
		}
		przetworzString("ania",slownik);
	}

}

