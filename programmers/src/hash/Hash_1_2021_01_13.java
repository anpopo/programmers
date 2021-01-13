package hash;

import java.util.*;

public class Hash_1_2021_01_13 {
	public String solution() {

		String answer = "";
        
		String[] participant = {"1", "2", "3", "1"};
		String[] completion = {"1", "2", "3"};
		
		
		
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String p : participant) {
            map.put(p, 1);
        }
        
        for (String c : completion) {
            map.put(c, 0);
        }
        
        for( String a : map.keySet()) {
        	if (map.get(a) == 1) {
        		answer = a;
        	}
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		
		String[] participant = {"5", "2", "3", "5", "5", "6", "5","3", "2", "3", "5", "5", "6", "5","3"};
		String[] completion = {"5", "2", "3", "5", "6", "5","3", "2", "3", "5", "6", "5","3", "5"};
		
		
		
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String p : participant) {
        	if (map.containsKey(p)) {
        		map.put(p, map.get(p) + 1);	
        	} else {
        		map.put(p,1);	
        		
        	}
        }
        
        
        System.out.println(map);
        
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        System.out.println(map);
        
        
        for( String a : map.keySet()) {
        	
        	if (map.get(a) != 0) {
        		System.out.println(a);
        		break;
        	}
        }
		
	}
}
