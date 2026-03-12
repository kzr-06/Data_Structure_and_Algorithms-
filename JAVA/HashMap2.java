package JAVA;
import java.util.*;


public class HashMap2 {
	public static void main(String[] args) {
		// Map<Integer, Character> map=new HashMap<>();
		// map.put(1,'a');
		// map.put(3,'y');
		// map.put(6,'u');
		// map.put(2,'z');
		// map.put(4,'a');
		// map.put(1,'f');
		// System.out.println(map);

		// for(Integer i:map.keySet())
		// {
		// 	System.out.println(i+"->"+map.get(i));
		// }

	// 	System.out.println("Entry set");
	// 	for(Map.Entry<Integer, Character> e:map.entrySet())
	// 		System.out.println(e.getKey()+"="+e.getValue());
	//    map.forEach((k,v)-> System.out.println(k+" : "+v));
////	  
		// System.out.println(map.get(1));
		// System.out.println(map.values());
		// System.out.println(map.keySet());
		// System.out.println(map.containsKey(5));
		// System.out.println(map.containsValue('y'));
		// System.out.println(map.isEmpty());
		// System.out.println(map.remove(6));
		// System.out.println(map);
      	// map.remove(4,'a');
		// map.replace(2, 'o');
		// System.out.println(map);
		// map.putIfAbsent(5, 'p');
		// System.out.println(map);
/// 
/// 
/// 
		// Map<Integer, Character> map1=new LinkedHashMap<>();
		// map1.put(1,'a');
		// map1.put(3,'y');
		// map1.put(6,'u');
		// map1.put(2,'z');
		// map1.put(4,'a');
		// map1.put(1,'f');
		// System.out.println(map1);


		// Map<Integer, Character> map=new TreeMap<>();
		// map.put(1,'a');
		// map.put(3,'y');
		// map.put(6,'u');
		// map.put(2,'z');
		// map.put(4,'a');
		// map.put(1,'f');
		// System.out.println(map);
        
		String str = "banana";
		Map<Character, Integer> map = new HashMap<>();
        
		for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
		}
        
        System.out.println(map);
		// System.out.println(map);
		// // TODO Auto-generated method stub

	}

}